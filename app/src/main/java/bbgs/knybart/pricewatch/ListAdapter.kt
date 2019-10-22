package bbgs.knybart.pricewatch

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class ListAdapter(context: Context) : BaseAdapter() {


    private val mContext: Context

    init {
        mContext = context
    }

    private val products = arrayListOf("Computer", "Monitor", "Milk")
    private val prices = arrayListOf(1200.0,420.0,1.99)

    override fun getCount(): Int {
        return products.size
    }

    override fun getItem(position: Int): Any {
        return "TEST"
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater = LayoutInflater.from(mContext)
        val rowMain = layoutInflater.inflate(R.layout.row_main, parent, false)

        val descriptionTextView = rowMain.findViewById<TextView>(R.id.list_item_description)
        val titleTextView = rowMain.findViewById<TextView>(R.id.list_item_title)
        val priceTextView = rowMain.findViewById<TextView>(R.id.list_item_price)


        descriptionTextView.text = "Row number $position"
        titleTextView.text = products.get(position)
        priceTextView.text = prices.get(position).toString()
        return rowMain
    }
}