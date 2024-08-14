package com.aadarsh.rickymorty.ui.list

import androidx.lifecycle.*
import com.aadarsh.rickymorty.data.models.Details
import com.aadarsh.rickymorty.repository.RickandMortyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ListViewModel @Inject constructor(
    private val repository: RickandMortyRepository
) : ViewModel() {

    private val taskEventChannel = Channel<TaskEvent>()
    val taskEvent = taskEventChannel.receiveAsFlow()

    private val currentQuery = MutableLiveData("")
    private val statusSelected = MutableLiveData("")


    private val charactersFlow =
        combine(currentQuery.asFlow(), statusSelected.asFlow()) { query_, status_ ->
            Pair(query_, status_)
        }.flatMapLatest { (query_, status_) ->
            repository.getSearchResults(query_, status_).asFlow()
        }

    val characters = charactersFlow.asLiveData()


    fun searchCharacter(query: String) {
        currentQuery.value = query
    }

    fun statusChoose(status: String) {
        statusSelected.value = status
    }


    fun openCharacterDetails(details: Details) = viewModelScope.launch {
        taskEventChannel.send(TaskEvent.NavigateToDetailScreen(details))
    }

    sealed class TaskEvent {

        data class NavigateToDetailScreen(val details: Details) : TaskEvent()

    }

}