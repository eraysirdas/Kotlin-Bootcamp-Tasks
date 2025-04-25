package com.eraysirdas.secondwork

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(angleTotal(2))
        println(angleTotal(3))

        println("Toplam Ücret : " + salaryCalculation(20,8))
        println("Toplam Ücret : " + salaryCalculation(5,0))

        println(quotaFeeCalculation(12.50))
        println(quotaFeeCalculation(65.00))

        println(celsiusToFahrenheit(25.1f))
        println(celsiusToFahrenheit(50.2f))

        calculateRectanglePerimeter(10.0,15.0)
        calculateRectanglePerimeter(40.0,20.0)

        println("Faktöriyel : "+ calculateFactorial(4))

        characterCount("eray")
        characterCount("aslan kaplan ejderha canavar")


    }

    private fun angleTotal(edgeCount : Int) : Any{
        return if (edgeCount<=2) "Uyarı! 2 den büyük bir değer giriniz" else "İç Açılar Toplam : " + (edgeCount-2)*180
    }

    private fun salaryCalculation(dayCount : Int,totalShift : Int): Int {
        val dailyWork = dayCount*8 // günlük çalışma
        val totalDailySalary = dailyWork*10 // günlük için toplam maaş

        var shiftSalary=totalShift*20 //mesai ücreti

        val hoursTotalShift = dailyWork+totalShift //160 saat sonrası oluşan mesai

        if(hoursTotalShift>160){
            shiftSalary += (totalShift * 20) // güncel mesai ücreti
        }

        return totalDailySalary+shiftSalary
    }

    private fun quotaFeeCalculation(quotaAmount : Double): String{
        val totalFee = if(quotaAmount<=50){
            (quotaAmount/50)*100 // 50GB altı için kota ücreti
        }else{
            100+(quotaAmount-50)*4 //50GB üstü için kota ücreti
        }
        return "Kota Miktarı : $quotaAmount Kota Ücreti : $totalFee TL"
    }

    private fun celsiusToFahrenheit(celsius : Float) : String{
        return "Celsius: ${celsius}C  Fahrenheit: ${celsius* 1.8 + 32}F"
    }

    private fun calculateRectanglePerimeter(length : Double, width: Double){
        println("Dikdötgen Çevresi : ${(length+width)*2}")
    }

    private fun calculateFactorial(number: Int) : Int{
        if(number>1){
            return number * calculateFactorial(number-1)
        }else{
            return 1
        }
    }

    private fun characterCount(text : String){
        var count = 0
        for(i in text){
            if(i=='a' || i=='A'){
                count+=1
            }
        }
        println("Kelimeniz: $text | İçindeki 'a/A' harfi sayısı: $count")
    }
}