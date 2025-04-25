package com.eraysirdas.firstwork.model

data class ModelBase(
    val personalInfo: PersonalInfo? = null,
    val orderInfo: OrderInfo? = null,
    val productInfo: ProductInfo? = null,
    val locationInfo: LocationInfo? = null,
    val reservationInfo: ReservationInfo? = null
) {
    init {
        println("Model Base started...")
    }

    fun printModelInfo() {
        println("\n*********** Personel Bilgisi ***********")
        personalInfo?.let {
            println("Şehir: ${it.city}")
            println("Ülke: ${it.country}")
            println("Telefon: ${it.phone}")
            println("Posta Kodu: ${it.postalCode}")
            println("E-posta: ${it.email}")
            println("Meslek: ${it.job}")
            println("Müşteri Adı: ${it.customerName}")
            println("Doğum Günü: ${it.birthDay}")
            println("Maaş: ${it.salary}")
            println("Medeni Durum: ${it.maritalStatus}")
        } ?: println("Personel bilgisi mevcut değil.")

        println("\n*********** Sipariş Bilgisi ***********")
        orderInfo?.let {
            println("Ödeme Tarihi: ${it.paymentDate}")
            println("Ödeme: ${it.payment}")
            println("Sipariş Adeti: ${it.orderQuantity}")
            println("Bakiye: ${it.balance}")
            println("Ürün Adı: ${it.productName}")
            println("Takip Kodu: ${it.trackingCode}")
            println("Fatura Adresi: ${it.billingAddress}")
        } ?: println("Sipariş bilgisi mevcut değil.")

        println("\n*********** Ürün Bilgisi ***********")
        productInfo?.let {
            println("Stok Miktarı: ${it.stockQuantity}")
            println("Ürün Adı: ${it.productName}")
            println("Ürün Puanı: ${it.productRating}")
            println("Ürün Yorum: ${it.productReview}")
            println("İndirim Miktarı: ${it.discountAmount}")
            println("Kupon Süresi: ${it.couponDuration}")
            println("Kupon Kodu: ${it.couponCode}")
            println("Marka: ${it.brand}")
            println("Araba Modeli: ${it.carModel}")
            println("Kitap Adı: ${it.bookTitle}")
            println("Müzik Adı: ${it.musicTitle}")
            println("Resim Adı: ${it.imageName}")
            println("Video Süresi: ${it.videoDuration}")
            println("Dosya Formatı: ${it.fileFormat}")
            println("Renk: ${it.color}")
            println("Renk Kodu: ${it.colorCode}")
            println("Telefon Modeli: ${it.phoneModel}")
            println("Ekran Boyutu: ${it.screenSize}")
            println("Ağırlık: ${it.weight}")
        } ?: println("Ürün bilgisi mevcut değil.")

        println("\n*********** Lokasyon Bilgisi ***********")
        locationInfo?.let {
            println("Enlem: ${it.latitude}")
            println("Boylam: ${it.longitude}")
            println("Sokak Adı: ${it.streetName}")
            println("Otobüs Hattı: ${it.busLine}")
        } ?: println("Lokasyon bilgisi mevcut değil.")

        println("\n*********** Rezervasyon Bilgisi ***********")
        reservationInfo?.let {
            println("Yayınlama Tarihi: ${it.publishDate}")
            println("Ulusal Gün: ${it.nationalHoliday}")
            println("Tatil Günü: ${it.holiday}")
            println("Rezervasyon Tarihi: ${it.reservationDate}")
            println("Oda Sayısı: ${it.roomCount}")
            println("Kalan Dakika: ${it.remainingMinutes}")
        } ?: println("Rezervasyon bilgisi mevcut değil.")
    }
}

data class PersonalInfo(

    val city: String? = null,                 // Şehir
    val country: String? = null,              // Ülke
    val phone: String? = null,                // Telefon
    val postalCode: String? = null,           // Posta Kodu
    val email: String? = null,                // E-posta
    val job: String? = null,                  // Meslek
    val customerName: String? = null,         // Müşteri Adı
    val birthDay: String? = null,             // Doğum Günü
    val salary: Double? = null,               // Maaş
    val maritalStatus: MaritalStatus          // Medeni Durum
)

enum class MaritalStatus{
    Single,         //Bekar
    Married,        //Evli
    Divorced        //Boşanmıs
}

data class OrderInfo(
    val paymentDate: String? = null,          // Ödeme Tarihi
    val payment: Double? = null,              // Ödeme
    val orderQuantity: Int? = null,           // Sipariş Adeti
    val balance: Double? = null,              // Bakiye
    val productName: String? = null,          // Ürün Adı
    val trackingCode: String? = null,         // Takip Kodu
    val billingAddress: String? = null        // Fatura Adresi
)

data class ProductInfo(
    val stockQuantity: Int? = null,           // Stok Miktarı
    val productName: String? = null,          // Ürün Adı
    val productRating: Float? = null,         // Ürün Puanı
    val productReview: String? = null,        // Ürün Yorum
    val discountAmount: Double? = null,       // İndirim Miktarı
    val couponDuration: Int? = null,          // Kupon Süresi
    val couponCode: String? = null,           // Kupon Kodu
    val brand: String? = null,                // Marka
    val carModel: String? = null,             // Araba Modeli
    val bookTitle: String? = null,            // Kitap Adı
    val musicTitle: String? = null,           // Müzik Adı
    val imageName: String? = null,            // Resim Adı
    val videoDuration: Int? = null,           // Video Süresi
    val fileFormat: String? = null,           // Dosya Formatı
    val color: String? = null,                // Renk
    val colorCode: String? = null,            // Renk Kodu
    val phoneModel: String? = null,           // Telefon Modeli
    val screenSize: Double? = null,           // Ekran Boyutu
    val weight: Double? = null                // Ağırlık
)

data class LocationInfo(
    val latitude: Double? = null,             // Enlem
    val longitude: Double? = null,            // Boylam
    val streetName: String? = null,           // Sokak Adı
    val busLine: String? = null               // Otobüs Hattı
)

data class ReservationInfo(
    val publishDate: String? = null,          // Yayınlama Tarihi
    val nationalHoliday: String? = null,      // Ulusal Gün
    val holiday: String? = null,              // Tatil Günü
    val reservationDate: String? = null,      // Rezervasyon Tarihi
    val roomCount: Int? = null,               // Oda Sayısı
    val remainingMinutes: Int? = null         // Kalan Dakika
)
