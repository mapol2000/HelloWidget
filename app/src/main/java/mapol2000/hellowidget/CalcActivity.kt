package mapol2000.hellowidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalcActivity : AppCompatActivity() {

    lateinit var edit1: EditText
    lateinit var edit2: EditText
    lateinit var textResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        // 액티비티가 생성되면 그때서야 레이아웃에 선언된 위젯에 대한 객체를 변수에 할당
        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)
        textResult = findViewById(R.id.TextResult)

    }

    fun computeAdd(v: View) {
        // 이벤트 발생시 각 위젯에 입력된 값을
        // 먼저 문자형으로 변환하고 숫자로 바꿔 더하기 연산 실시
        // 그런 다음 연산 결과를 해당 위젯으로 출력함
        val result = edit1.text.toString().toInt() + edit2.text.toString().toInt()
        textResult.text = "계산 결과: " + result.toString()
    }

    fun computeSub(v: View) {
        val result = edit1.text.toString().toInt() - edit2.text.toString().toInt()
        textResult.text = "계산 결과: " +result.toString()
    }

    fun computeMul(v: View) {
        val result = edit1.text.toString().toInt() * edit2.text.toString().toInt()
        textResult.text = "계산 결과: " +result.toString()
    }

    fun computeDiv(v: View) {
        val result = edit1.text.toString().toInt() / edit2.text.toString().toInt()
        textResult.text = "계산 결과: " +result.toString()
    }

}