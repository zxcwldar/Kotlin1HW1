package com.example.kotlon1homework1.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.kotlon1homework1.data.client.BookClient
import com.example.kotlon1homework1.models.BookModel

class BooksViewModel : ViewModel() {
    fun getBooks() : List <BookModel>{
        return BookClient().getBooks()
    }
}