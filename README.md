# DEaE-Mobile-Coding-Exercise
Disney and ESPN mobile coding exercise

# Libraries Usages

**Coil (Image Loading)**
Was debating whether to use Coil or Glide. Used Coil instead due to the concise usage for Jetpack Compose. Either library is good for asynchronous call for image loading.

**Retrofit2 and Gson (Networking and Serializing)**
Needed it to retrieve calls from the backend, as well as serializing the JSON with Gson.

**ViewModel Compose (AndroidX Lifecycle)**
Decided to use the compose version for ViewModel to make it easier to interact with the composable views.

### Retrospect
Would have added Dagger-Hilt for dependency injection, but due to the application scale size, it's not necessary.

# Developer Keys

Getting a hold of both public and private key was straightforward via Marvel Developer account.
Decided to make the two keys a variable in the Constant.kt with the other constant and hashing variables and function.

On the other hand, understanding the calls from Marvel's API was a bit tricky, since it needed both a timestamp and a special hash code as well.
