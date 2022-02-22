package com.wahyuindra.myshoeslistapp

object ShoesData {
    private val shoesName = arrayOf(
        "League",
        "Piero",
        "Compass",
        "Buccheri",
        "Wakai",
        "Brodo",
        "Tomkins",
        "Geoff Max",
        "Word Division",
        "NAH Project"
    )
    private val shoesDetails = arrayOf(
        "League adalah salah satu contoh merk lokal yang menonjolkan konsep sporty dan lifestyle untuk setiap produk yang ditawarkan.",
        "Sama kayak League, merk yang satu ini juga pasti udah familiar banget. Piero udah hadir sejak tahun 2000-an dan sukses bersaing dengan brand luar sampai sekarang.",
        "Inilah salah satu merk sepatu yang hype-nya paling gila. Di beberapa event sneakers, booth Compass hampir pasti punya antrian pembeli paling panjang.",
        "Buccheri juga terus berinovasi yang dibuktikan dengan hadirnya produk sneakers dengan kombinasi kedua bahan tersebut. Dan bisa dibilang sasaran customer-nya adalah segmen menengah atas.",
        "Wakai cocok buat lo yang sehari-hari tampil easy going dan casual. Produk yang ditawarkan adalah sneakers dan slip on shoes yang cocok buat semua gender.",
        "Brodo dikenal dengan produk outdoor shoes dan boots. Tapi merk ini juga menawarkan produk terbarunya yaitu sneakers dengan kualitas mumpuni.",
        "Tomkins adalah merk sepatu lokal yang juga sudah malang melintang di dunia footwear. Produk andalannya adalah sneakers dengan beragam pilihan warna.",
        "Geoff Max juga merupakan contoh merk lokal yang sedang digandrungi banyak anak muda. Bahkan banyak musisi tenar yang terang-terangan memakai produk dari Geoff Max.",
        "Word Division bisa bikin tampilan lo makin casual ala skateboarder. Buat lo yang emang suka aktivitas outdoor, merk ini bakalan cocok banget.",
        "Keunggulan utama yang ditawarkan NAH Project adalah bahan yang nyaman, fleksibel, dan lentur sehingga enak aja kalo dipake buat jalan jauh."

    )

    private val shoesImage = intArrayOf(
        R.drawable.sepatu_league,
        R.drawable.sepatu_piero,
        R.drawable.sepatu_kompas,
        R.drawable.sepatu_buccheri,
        R.drawable.sepatu_wakai,
        R.drawable.sepatu_brodo,
        R.drawable.sepatu_tomkins,
        R.drawable.sepatu_geofmax,
        R.drawable.sepatu_word_division,
        R.drawable.sepatu_nah_project
    )

    val listData : ArrayList<Shoes>
    get() {
        val list = arrayListOf<Shoes>()
        for (position in shoesName.indices) {
            val shoe = Shoes()
            shoe.name = shoesName[position]
            shoe.detail = shoesDetails[position]
            shoe.photo = shoesImage[position]
            list.add(shoe)
        }
        return list
    }
}