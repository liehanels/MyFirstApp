# 📱 My First App

Welcome to our first app together! This project is a foundational step into the world of Android development. It might look like a labyrinth at first, but stick to the map and you'll be fine.

## 📂 Locating the Source Code

To find the logic for the **Main Activity**, navigate through the following directory tree:

`app` > `src` > `main` > `java/com/example/myfirstapp` > **`MainActivity.kt`**

> [!NOTE]
> Inside **`MainActivity.kt`**, you will find all the code responsible for the backend logic and functionality.

---

## 🛠️ Essential Guidelines

### 1. Naming Conventions
**IMPORTANT:** Your variable names and element IDs might differ from mine. That's perfectly fine — the universe won't implode. Just ensure **YOUR** code consistently uses the names **YOU** created. 

### 2. Element Types & Crocodile Brackets `< >`
When linking elements, you must use the correct **Element Type** within the crocodile brackets. This tells the program exactly what it's looking at.

* If you are linking a text field, you will have `<TextView>`.
* If you are linking a button, you will have `<Button>`.

### 3. ID Assignment & `findViewById()`
If your default `TextView` is simply called `textView`, rename it to something more descriptive, like `tvTitle`. 

To link the backend to the frontend, use the `findViewById()` method. This is where you reference the ID you created in the XML/UI:
* **Pattern:** `R.id.ELEMENT_ID`
* **Example:** `R.id.tvTitle`

### 4. Variables vs. IDs
Don't get these two mixed up. If you define your element like this:

```kotlin
val title = findViewById<TextView>(R.id.tvTitle)
```
val title is the **element name** you will use in your code, tvTitle is the **elementId** you used to link the frontend to the backend and won't be used again in your code.
