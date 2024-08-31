

#  <h1 align="center">🛸 Rick and Morty App</h1>

<p align="center">  
 🛸The Rick and Morty character search app is an Android mobile application that provides fans of the popular TV series with a convenient way to search and browse through all the characters that have appeared on the show, it allows users to search for all characters, filter them based on their status (alive or dead), and view detailed information about each character. <br>
 🛸The app is built using modern Android development technologies and makes use of several libraries, including Retrofit, Paging3, Flows, and Coroutines. These libraries help to simplify the development process and ensure that the app performs smoothly and efficiently.<br>
 
</p>

<h2 align="center">Features⭐</h2>

- Display a list of Rick and Morty characters with their names and images
- Filter Rick and Morty characters by live, alive and unknown.
- View detailed information about each Rick and Morty character.

<h2 align="center">Architecture ☁</h2>

This app follows the MVVM (Model-View-ViewModel) architecture pattern. The components of the app are organized as follows:

- Model: The data source for the app is the PokeAPI, which provides information about Pokemon characters in JSON format. The app uses Retrofit to make network requests to the PokeAPI and Gson to deserialize the JSON responses into Java objects.

- View: The views in the app are implemented using Android's XML layout files. The main activity (MainActivity) contains a RecyclerView that displays a list of Pokemon characters, and a search bar that allows users to filter the list by name. Clicking on a character in the list navigates the user to the CharacterDetailActivity, which displays detailed information about the selected character.

- ViewModel: The CharacterViewModel class acts as an intermediary between the model and the view. It retrieves data from the model and exposes it to the view through observable data fields. It also provides methods for filtering the character list based on user input.




<h2 align="center">Getting Started 🚀</h2>

To run this app, you'll need to have Android Studio installed. Follow these steps to get started:

 - Clone this repository: git clone https://github.com/AadarshAadi/rickymortyapp.git
 - Open the project in Android Studio.
 - Build and run the app.

#  <h1 align="center">📚 Libraries and Tools Used </h1>

<p align="center">

- Retrofit
- Paging3
- ViewBinding
- Flows
- Coil
- Dagger Hilt
- Coroutines

</p>


