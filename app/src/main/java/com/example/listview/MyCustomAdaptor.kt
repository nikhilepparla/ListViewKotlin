package layout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.listview.R

class MyCustomAdaptor(val context: Context, val list: List<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View
        if (convertview == null) {
            view = inflater.inflate(R.layout.custom_adaptor, parent, false)
        } else {
            view = convertview
        }
        val item = getItem(position) as String
        val titleTextView = view.findViewById<TextView>(R.id.textview_ca)
        titleTextView.text = item
        return view
    }
}