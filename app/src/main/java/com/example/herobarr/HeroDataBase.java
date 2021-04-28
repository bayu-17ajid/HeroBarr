package com.example.herobarr;

import java.util.ArrayList;

public class HeroDataBase {
    private static String[] heroNames = {
            "Andre",
            "kelly",
            "kla",
            "ford",
            "caroline",
            "paloma",
            "nikita",
            "rafael",
            "maxim",
            "olivia"
    };

    private static String[] heroDetails = {
            "Karakter polisi ini secara otomatis akan didapatkan jika pemain melakukan log in selama tujuh hari berturut-turut. Skill yang dimiliki oleh Andrew adalah mampu mengurangi damage dari vest yang kamu gunakan. Semakin besar level karakternya, maka semakin besar pula efek skillnya.",
            "Berlari adalah salah satu bagian terpenting dalam bermain Free Fire. Salah satu karakter yang memiliki kemampuan berlari cepat adalah Kelly. Dengan skill Dash Run yang dimiliki Kelly, kamu bisa lebih mudah dalam mengejar safe zone, mempercepat proses mencari senjata, dan kabur dari kejaran musuh.",
            "Kla merupakan karakter Free Fire (FF) yang mahir dalam bela diri Muay Thai. Seperti yang kita tahu, Muay Thai merupakan seni beladiri yang mengandalkan sebuah pukulan dan tendangan. Sesuai latar belakangnya, Kla Free Fire memiliki skill tangan kosong yang sangat berbahaya bagi musuh. Damage pukulannya jika mengenai kepala bisa mencapai 275. Skill tersebut tentu sangat menguntungkan di awal-awal pertandingan, di saat para pemain lain belum menemukan senjata.",
            "Ford merupakan karakter FF yang memiliki kemampuan untuk meningkatkan daya tahan tubuh ketika berada di luar safe zone. Skill bernama The Will of Iron ini bisa diperkuat dengan menguprade karakternya. Caranya adalah dengan bermain setiap hari menggunakan karakter Ford. Setiap selesai pertandingan kamu akan mendapatkan fragment Ford yang bisa digunakan untuk upgrade.",
            "Bagi kamu penikmat pertempuran jarak dekat, maka sangat direkomendasikan untuk menggunakan karakter wanita polos yang satu ini. Meski terlihat imut, nyatanya skill pasif Agility yang dimilikinya sangat berbahaya bagi musuh. Caroline dapat berlari cepat saat memegang salah satu senjata terbaik Free Fire tipe shotgun. Sayangnya skillnya ini hanya akan aktif pada satu senjata saja.",
            "Saat bermain Free Fire, kita seringkali kebingungan ketika tas yang kita bawa tidak bisa menampung semua barang yang kita ambil. Alhasil pemain harus memilah dan membuang beberapa item di dalam tas. Namun hal ini tidak berlaku saat kamu menggunakan Paloma. Kemampuan yang dimiliki Paloma mampu menampung banyak peluru senjata AR (Assault Rifle) tanpa mengurangi kapasitas inventaris. Dengan begitu, kegiatan looting pun jadi terasa lebih leluasa.",
            "Jika kamu pengguna setia senjata SMG (Sub Machine Gun) seperti MP40 dan VSS, maka karakter ini sangat cocok untuk kamu gunakan. Berlatar belakang seorang bodyguard, Nikita memiliki kemampuan Firearms Expert, di mana ia mampu melakukan reload senjata SMG dengan sangat cepat. Eits, jangan tertipu dengan tampilannya yang menggoda, Nikita sangat mematikan loh guys.",
            "Pada saat kita menembak musuh, biasanya musuh akan langsung tahu keberadaan kita lewat tanda pada map. Namun tidak demikian jika kamu menggunakan Rafael Free Fire sebagai karakter pilihan. Sebagai seorang pembunuh bayaran, Rafael memiliki skill Dead Silent yang mampu membuat posisi keberadaannya tidak terdeteksi di map selama 8 detik. Sehingga musuh pun akan kebingungan mencari sumber tembakan.",
            "Saat memakan jamur atau menggunakan medkit, terkadang butuh waktu untuk memulihkan darah karakter yang kita gunakan. Nah, dengan kemampuan yang dimiliki Maxim, kamu nggak perlu lagi was-was saat sedang menggunakan medkit. Pasalnya, karakter berusia 17 tahun ini bisa mempercepat makan jamur dan menggunakan medkit.",
            "Olivia menjadi salah satu karakter yang sangat cocok dimainkan dalam mode squad. Kenapa? Karena kemampuan yang dimiliknya adalah menambah darah teman yang kita pulihkan saat tertembak. Dengan menggunakan skill ini, siapapun yang diselamatkan Olivia bisa bertahan hidup lebih lama. Sayangnya skill ini hanya berfungsi di mode squad."

    };

    private static int[] heroesImages = {
            R.drawable.andre,
            R.drawable.kelly,
            R.drawable.kla,
            R.drawable.ford,
            R.drawable.caroline,
            R.drawable.paloma,
            R.drawable.nikita,
            R.drawable.rafael,
            R.drawable.maxim,
            R.drawable.olivia
    };

    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++){
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}