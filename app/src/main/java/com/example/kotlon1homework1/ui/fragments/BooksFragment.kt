package com.example.kotlon1homework1.ui.fragments


import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlon1homework1.R
import com.example.kotlon1homework1.base.BaseFragment
import com.example.kotlon1homework1.data.client.BookClient
import com.example.kotlon1homework1.databinding.FragmentBooksBinding
import com.example.kotlon1homework1.interfaces.OnItemClickListener
import com.example.kotlon1homework1.models.BookModel
import com.example.kotlon1homework1.ui.adapters.BooksAdapter


class BooksFragment : BaseFragment<FragmentBooksBinding>(
    R.layout.fragment_books
), OnItemClickListener<BookModel> {
    override val binding: FragmentBooksBinding by viewBinding(FragmentBooksBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()
    private val adapter = BooksAdapter(this)

    override fun initAdapter() {
        adapter.setList(viewModel.getBooks())
        binding.recyclerview.adapter = adapter

    }

    override fun onClick(model: BookModel, position: Int) {
        findNavController().navigate(
            BooksFragmentDirections.actionBooksFragmentToBooksDetailsFragment(
                model.description, model.title
            )
        )

    }


}