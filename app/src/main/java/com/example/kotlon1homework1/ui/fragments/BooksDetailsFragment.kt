package com.example.kotlon1homework1.ui.fragments

import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlon1homework1.R
import com.example.kotlon1homework1.base.BaseFragment
import com.example.kotlon1homework1.databinding.FragmentBooksDetailsBinding

class BooksDetailsFragment : BaseFragment<FragmentBooksDetailsBinding>(
    R.layout.fragment_books_details
) {
    override val binding: FragmentBooksDetailsBinding by viewBinding(FragmentBooksDetailsBinding::bind)
    private val args: BooksDetailsFragmentArgs by navArgs()



    override fun getArgs() {
        binding.tvTitle.text = args.titleFromBooksFragmentToDetails
        binding.tvDescription.text = args.descriptionlFromBooksFragment

    }


}