package com.example.uikittink

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView


class CardCountBut
@JvmOverloads
constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private var titleText: TextView
    private var subTitleText: TextView
    private var button: Button
    private var icon: ImageView

    init {
        inflate(context, R.layout.card_cont_but, this)

        val ta = context.theme.obtainStyledAttributes(attrs, R.styleable.CardCountBut, 0, 0)
        val title = ta.getString(R.styleable.CardCountBut_title_with_but)
        val subTitle = ta.getString(R.styleable.CardCountBut_sub_title_with_but)
        val butText = ta.getString(R.styleable.CardCountBut_but_text)

        titleText = this.findViewById<TextView>(R.id.title)
        subTitleText = this.findViewById<TextView>(R.id.sub_title)
        button = this.findViewById<Button>(R.id.but)
        icon = this.findViewById<ImageView>(R.id.icon)

        titleText.text = title
        subTitleText.text = subTitle
        button.text = subTitle
    }

    fun setOnTitleClick(call: () -> Unit) {
        titleText.setOnClickListener {
            call.invoke()
        }
    }

    fun setOnSubTitleClick(call: () -> Unit) {
        subTitleText.setOnClickListener {
            call.invoke()
        }
    }

    fun setOnClickBut(call: () -> Unit) {
        button.setOnClickListener {
            call.invoke()
        }
    }

    fun setOnClickIcon(call: () -> Unit) {
        icon.setOnClickListener {
            call.invoke()
        }
    }
}