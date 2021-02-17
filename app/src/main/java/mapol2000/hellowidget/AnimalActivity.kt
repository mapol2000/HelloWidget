package mapol2000.hellowidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class AnimalActivity : AppCompatActivity() {

    lateinit var text2: TextView

    lateinit var chkAgree: CheckBox
    lateinit var rGroup: RadioGroup
    lateinit var rdoDog: RadioButton
    lateinit var rdoCat: RadioButton
    lateinit var rdoRabbit: RadioButton

    lateinit var btnOk: Button
    lateinit var imgPet: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        title = "애완동물 보기 앱"

        initvar()

        // 체크박스 클릭시 이벤트 처리
        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
//            if (chkAgree.isChecked) { // 체크박스가 체크 되어있다면
//                text2.visibility = View.VISIBLE
//                rGroup.visibility = View.VISIBLE
//                btnOk.visibility = View.VISIBLE
////                imgPet.visibility = android.view.View.VISIBLE
//            } else {
//                text2.visibility = View.INVISIBLE
//                rGroup.visibility = View.INVISIBLE
//                btnOk.visibility = View.INVISIBLE
//                imgPet.visibility = View.INVISIBLE
//            }
            var state = if (chkAgree.isChecked) {
                View.VISIBLE
            } else {
                View.INVISIBLE
            }
            text2.visibility = state
            rGroup.visibility = state
            btnOk.visibility = state
//            imgPet.visibility = state
        }
    }

    fun initvar() {
        text2 = findViewById(R.id.text2)
        chkAgree = findViewById(R.id.chkAgree)
        rGroup = findViewById(R.id.rGroup)
        rdoDog = findViewById(R.id.rdoDog)
        rdoCat = findViewById(R.id.rdoCat)
        rdoRabbit = findViewById(R.id.rdoRabbit)
        btnOk = findViewById(R.id.btnOk)
        imgPet = findViewById(R.id.imgPet)
    }

    // imageView에 그림을 표시하려면
    // 먼저, res -> drawable에 그림파일을 업로드하고
    // 그림파일 호출시 'R.drawable.그림파일명'으로 지정하면 됨
    // 라디오버튼그룹내 특정 라디오버튼이 클릭된 것을 알아내려면
    // '라디오버튼그룹명.checkedRadioButtonId'을 사용하면 됨
    fun showAnimal(v:View) { // btnOk 버튼 클릭시 선택적 이미지 표시
        imgPet.visibility = View.VISIBLE
        when (rGroup.checkedRadioButtonId) {
            R.id.rdoDog -> imgPet.setImageResource(R.drawable.dog)
            R.id.rdoCat -> imgPet.setImageResource(R.drawable.cat)
            R.id.rdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
        }
    }

}