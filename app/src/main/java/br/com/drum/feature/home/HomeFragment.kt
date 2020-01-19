package br.com.drum.feature.home

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.drum.R
import br.com.drum.extensions.onStateChange
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject

class HomeFragment(
    private val viewModel: HomeViewModel
) : Fragment(R.layout.fragment_home) {

    private val adapter : HomeListAdapter by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()

        setStateChangeListener()
    }

    private fun setRecyclerView() {
        listRecente.apply {
            val orientation = RecyclerView.HORIZONTAL
            val leftDivider = MarginListItemDecoration(MarginListItemDecoration.Direction.LEFT)

            adapter = this@HomeFragment.adapter
            layoutManager = LinearLayoutManager(context, orientation, false)
            addItemDecoration(leftDivider)
        }

        listPopular.apply {
            val orientation = RecyclerView.HORIZONTAL
            val leftDivider = MarginListItemDecoration(MarginListItemDecoration.Direction.LEFT)

            adapter = this@HomeFragment.adapter
            layoutManager = LinearLayoutManager(context, orientation, false)
            addItemDecoration(leftDivider)
        }
    }

    private fun setStateChangeListener() = onStateChange(viewModel) {
        adapter.elements = it.listItems
        progressBarRecente.isVisible = it.isProgressBarVisible
        listRecente.isVisible = it.isListVisible
        progressBarPopular.isVisible = it.isProgressBarVisible
        listPopular.isVisible = it.isListVisible
    }
}