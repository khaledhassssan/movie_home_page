package com.khaled.moviehomepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khaled.moviehomepage.adapter.MainRecyclerAdapter
import com.khaled.moviehomepage.model.AllCategory
import com.khaled.moviehomepage.model.CategoryItem

class MainActivity : AppCompatActivity() {

    private var mainCategoryRecycler :RecyclerView? =null
    private var mainRecyclerAdapter : MainRecyclerAdapter? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryItemList1 : MutableList<CategoryItem> =ArrayList()
        categoryItemList1.add(CategoryItem(1 , R.drawable.frozen))
        categoryItemList1.add(CategoryItem(1 , R.drawable.incredibles_2))
        categoryItemList1.add(CategoryItem(1 , R.drawable.insideout))
        categoryItemList1.add(CategoryItem(1 , R.drawable.rio))
        categoryItemList1.add(CategoryItem(1 , R.drawable.toystory4))
        categoryItemList1.add(CategoryItem(1 , R.drawable.up))
        categoryItemList1.add(CategoryItem(1 , R.drawable.zootopia))
        categoryItemList1.add(CategoryItem(1 , R.drawable.thegrinch))
        categoryItemList1.add(CategoryItem(1 , R.drawable.tangled))


        val allCategory : MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("HollyWood", categoryItemList1))
        allCategory.add(AllCategory("Best of Oscars" ,categoryItemList1))
        allCategory.add(AllCategory("Movies Duded in Hindi",categoryItemList1))
        allCategory.add(AllCategory("Category 4th",categoryItemList1))
        allCategory.add(AllCategory("Category 5th",categoryItemList1))
        allCategory.add(AllCategory("Category 6th",categoryItemList1))

        setMainCategoryRecycler(allCategory)

    }
    private fun setMainCategoryRecycler(allCategory: List<AllCategory>){

        mainCategoryRecycler = findViewById(R.id.main_recycler)
        val layoutManager: RecyclerView.LayoutManager=LinearLayoutManager(this)
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this,allCategory)
        mainCategoryRecycler!!.adapter = mainRecyclerAdapter

    }
}