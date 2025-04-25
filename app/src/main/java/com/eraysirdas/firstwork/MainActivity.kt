package com.eraysirdas.firstwork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eraysirdas.firstwork.model.LocationInfo
import com.eraysirdas.firstwork.model.MaritalStatus
import com.eraysirdas.firstwork.model.ModelBase
import com.eraysirdas.firstwork.model.OrderInfo
import com.eraysirdas.firstwork.model.PersonalInfo
import com.eraysirdas.firstwork.model.ProductInfo
import com.eraysirdas.firstwork.model.ReservationInfo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ModelBase(
            PersonalInfo("İstanbul", "Türkiye", "+90 512 345 67 89", "34000", "ornek.kisi@example.com", "Bilgisayar Mühendisi", "Hasan Ali", "20.03.200", 30000.0, MaritalStatus.Single),
            OrderInfo("2025-04-20", 1499.99, 2, 300.50, "Kablosuz Kulaklık - Pro Max Edition", "TRK123456789", "Yenişehir, Mersin"),
            ProductInfo(100, "Samsung Galaxy S23", 4.5f, "Harika bir telefon", 150.0, 30, "DISCOUNT2025", "Samsung", "BMW 320i", "Yeraltından Notlar", "Enter Sandman", "samsung_s23.jpg", 120, "MP4", "Koyu Siyah", "#000000", "Galaxy S23", 6.1, 169.0),
            LocationInfo(41.0082, 28.9784, "İstiklal Caddesi", "Beyoğlu-2"),
            ReservationInfo("2025-04-25", "Cumhuriyet Bayramı", "Ramazan Bayramı", "2025-05-01", 2, 120)
        )

        model.printModelInfo()
    }
}