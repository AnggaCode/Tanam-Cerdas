package com.nine.tanamcerdas.core.data

data class Plants(
    val id: String,
    val plantName: String,
    val plantType: String,
    val plantPhoto: String,
    val plantSeason: String,
    val costCultivation: Long,
    val descroption: String,
    val popularity: Long,
)

val plantList = listOf(
    Plants(
        "1",
        "Cabe",
        "buah",
        "https://images.unsplash.com/photo-1583506522440-b2639ef4c1d8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8Y2hpbGl8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=600&q=60",
        "Musim Panas",
        5000,
        "Cabe adalah tumbuhan yang dapat ditanam dengan baik di musim panas. Cabe merupakan tanaman berbunga dengan daun hijau yang tumbuh tegak. Buah cabe biasanya berwarna hijau saat belum matang dan berubah menjadi merah atau kuning saat matang. Tanaman cabe membutuhkan sinar matahari yang cukup dan tanah yang drainasenya baik. Tanah yang kaya akan nutrisi juga dapat meningkatkan pertumbuhan cabe. Untuk penanaman cabe, disarankan untuk menyiram tanaman secara teratur dan memberikan pupuk organik untuk menjaga kesuburan tanah. Cabe dapat digunakan sebagai bumbu dapur atau sebagai bahan dalam masakan pedas. Selain itu, cabe juga memiliki nilai nutrisi yang baik dan kaya akan vitamin C.",
        546
    ),
    Plants(
        "2",
        "Tomat",
        "buah",
        "https://images.unsplash.com/photo-1562695530-ca03c4b98623?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=626&q=80",
        "Musim Panas",
        6000,
        "Tomat adalah tumbuhan yang paling baik ditanam di musim panas. Tomat merupakan tanaman yang memiliki batang lunak dan tumbuh menjalar. Buah tomat biasanya berwarna merah saat matang, tetapi ada juga variasi yang berwarna kuning, hijau, atau ungu. Tanaman tomat membutuhkan lokasi yang cerah dan terkena sinar matahari langsung setidaknya 6-8 jam sehari. Tanah yang subur dan kaya akan nutrisi sangat penting bagi pertumbuhan tomat. Untuk penanaman tomat, disarankan untuk menyiram tanaman secara teratur dan memberikan dukungan seperti tiang atau kerangka untuk menjaga tanaman tetap tegak. Buah tomat dapat digunakan dalam berbagai hidangan seperti salad, saus, atau dimakan langsung. Tomat juga mengandung banyak vitamin dan antioksidan yang baik untuk kesehatan tubuh.",
        875
    ),
    Plants(
        "3",
        "Bawang",
        "sayur",
        "https://images.unsplash.com/photo-1618512496248-a07fe83aa8cb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8b25pb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=600&q=60",
        "Musim Dingin",
        4000,
        "Bawang adalah tumbuhan yang dapat tumbuh dengan baik di musim dingin. Bawang merupakan tanaman umbi yang tumbuh di bawah tanah. Bawang memiliki batang yang pendek dan daun yang runcing. Umbi bawang biasanya berwarna putih atau merah. Tanaman bawang membutuhkan tanah yang bebas dari genangan air dan paparan sinar matahari yang cukup. Bawang dapat ditanam dari biji atau umbi-umbian. Untuk penanaman bawang, disarankan untuk memberikan jarak yang cukup antara tanaman untuk pertumbuhan yang optimal. Bawang dapat digunakan sebagai bumbu dalam masakan dan memiliki rasa yang khas. Selain itu, bawang juga memiliki kandungan nutrisi yang baik dan dapat memberikan manfaat untuk kesehatan seperti meningkatkan sistem kekebalan tubuh dan melawan radikal bebas.",
        70
    ),
    Plants(
        "4",
        "Ubi",
        "umbi",
        "https://images.unsplash.com/photo-1668439887450-7648c88e3f5f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Y2Fzc2F2YXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=600&q=60",
        "Musim Hujan",
        7000,
        "Ubi adalah tumbuhan yang tumbuh subur saat musim hujan. Ubi termasuk dalam keluarga tanaman umbi-umbian. Ubi memiliki batang yang merambat dan daun hijau yang lebar. Umbi ubi biasanya berwarna oranye, ungu, atau putih. Tanaman ubi membutuhkan tanah yang lembab namun tidak tergenang air, suhu yang hangat, dan penyiraman yang konsisten selama musim hujan. Ubi dapat ditanam melalui umbi atau bibit. Untuk penanaman ubi, disarankan untuk memberikan dukungan seperti pagar atau tali agar tanaman tidak merambat di tanah. Ubi dapat digunakan dalam berbagai hidangan seperti rebusan, panggang, atau diolah menjadi makanan penutup. Ubi juga mengandung karbohidrat kompleks dan serat yang baik untuk kesehatan pencernaan.",
        340
    ),
    Plants(
        "5",
        "Padi",
        "biji",
        "https://images.unsplash.com/photo-1599328580087-15c9dab481f3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
        "Musim Hujan",
        8000,
        "Padi adalah tanaman pangan yang tumbuh terbaik saat musim hujan. Padi merupakan tanaman rumput yang tumbuh tegak. Bagian padi yang digunakan sebagai bahan makanan adalah bijinya. Tanaman padi membutuhkan tanah yang bersifat lembab, genangan air, dan paparan sinar matahari yang cukup. Padi dapat ditanam melalui benih yang direndam terlebih dahulu sebelum ditanam di sawah atau lahan basah. Untuk penanaman padi, disarankan untuk mengendalikan gulma dan hama yang dapat merusak tanaman. Padi merupakan salah satu makanan pokok yang dikonsumsi di banyak negara. Padi memiliki kandungan karbohidrat yang tinggi dan menjadi sumber energi utama bagi manusia. Selain itu, padi juga memberikan nilai ekonomis yang penting dalam industri pertanian.",
        100
    ),
    Plants(
        "6",
        "Jahe",
        "umbi",
        "https://images.unsplash.com/photo-1635843104103-ddd88e1c5141?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
        "Musim Panas",
        3000,
        "Jahe adalah tumbuhan yang paling baik ditanam di musim panas. Jahe merupakan tanaman rimpang yang tumbuh rendah dengan batang yang bercabang. Rimpang jahe memiliki warna kuning atau coklat dan memiliki aroma yang khas. Tanaman jahe membutuhkan tanah yang kaya nutrisi, sinar matahari yang cukup, dan perawatan seperti pemupukan secara teratur. Jahe dapat ditanam melalui rimpang yang dipotong menjadi beberapa bagian. Untuk penanaman jahe, disarankan untuk menyiram tanaman secara teratur dan memberikan dukungan seperti tali agar tanaman tidak roboh. Rimpang jahe dapat digunakan sebagai bumbu dapur atau dalam minuman seperti teh jahe. Jahe juga memiliki sifat anti-inflamasi dan dapat membantu mengurangi rasa mual.",
        650
    ),
    Plants(
        "7",
        "Kunyit",
        "umbi",
        "https://images.unsplash.com/photo-1666818398897-381dd5eb9139?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTA2fHx0dXJtZXJpY3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=600&q=60",
        "Musim Panas",
        3500,
        "Kunyit adalah tumbuhan yang dapat tumbuh dengan baik di musim panas. Kunyit merupakan tanaman rimpang yang memiliki warna kuning cerah. Rimpang kunyit dapat digunakan sebagai bumbu dapur atau sebagai bahan dalam obat tradisional. Tanaman kunyit membutuhkan tanah yang subur, penyiraman yang cukup, dan perlindungan dari sinar matahari langsung yang terlalu panas. Kunyit dapat ditanam melalui rimpang yang dipotong menjadi beberapa bagian. Untuk penanaman kunyit, disarankan untuk memberikan jarak yang cukup antara tanaman untuk pertumbuhan yang optimal. Kunyit memiliki kandungan kurkumin yang memiliki sifat antioksidan dan anti-inflamasi. Selain itu, kunyit juga digunakan dalam pengobatan tradisional untuk meningkatkan pencernaan dan meningkatkan kekebalan tubuh.",
        450
    ),
    Plants(
        "8",
        "Stroberi",
        "buah",
        "https://images.unsplash.com/photo-1587393855524-087f83d95bc9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8c3RyYWJlcnJ5fGVufDB8fDB8fHww&auto=format&fit=crop&w=600&q=60",
        "Musim Semi",
        4500,
        "Stroberi adalah tumbuhan yang paling baik ditanam di musim semi. Stroberi merupakan tanaman merambat dengan batang yang panjang. Buah stroberi memiliki warna merah cerah dan memiliki rasa manis yang khas. Tanaman stroberi membutuhkan sinar matahari penuh, tanah yang lembab, dan penyiraman teratur untuk pertumbuhan yang optimal. Stroberi dapat ditanam melalui bibit atau stolon. Untuk penanaman stroberi, disarankan untuk memberikan dukungan seperti kerangka atau tiang agar tanaman tetap terangkat. Buah stroberi dapat dikonsumsi segar, digunakan dalam hidangan penutup, atau dalam jus. Stroberi memiliki kandungan vitamin C yang tinggi dan antioksidan yang baik untuk kesehatan kulit dan sistem kekebalan tubuh.",
        700
    ),
    Plants(
        "9",
        "Bayam",
        "sayur",
        "https://images.unsplash.com/photo-1560807707-1d60a5e9de56?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8cGFydHxlbnwwfHwwfHx8&auto=format&fit=crop&w=600&q=60",
        "Musim Semi",
        3000,
        "Bayam adalah tumbuhan yang tumbuh dengan baik di musim semi. Bayam merupakan tanaman daun hijau yang biasa digunakan dalam masakan. Daun bayam memiliki tekstur yang lembut dan rasanya yang segar. Tanaman bayam membutuhkan paparan sinar matahari yang cukup dan tanah yang lembab namun tidak tergenang air. Bayam dapat ditanam melalui biji atau bibit. Untuk penanaman bayam, disarankan untuk memberikan jarak yang cukup antara tanaman untuk pertumbuhan yang optimal. Daun bayam dapat digunakan dalam salad, sup, atau tumis. Bayam juga kaya akan serat dan nutrisi seperti zat besi, kalsium, dan vitamin K.",
        400
    ),

    Plants(
        "10",
        "Lavender",
        "biji",
        "https://images.unsplash.com/photo-1515521832687-7a03d92a45e9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8bGF2ZW5kZXJ8ZW58MHx8MHx8&auto=format&fit=crop&w=600&q=60",
        "Musim Panas",
        5500,
        "Lavender adalah tanaman yang paling baik ditanam di musim panas. Lavender merupakan tanaman herba dengan bunga berwarna ungu yang harum. Tanaman lavender membutuhkan sinar matahari penuh dan tanah yang berdrainase baik. Lavender dapat ditanam melalui biji atau stek. Untuk penanaman lavender, disarankan untuk memberikan jarak yang cukup antara tanaman untuk pertumbuhan yang optimal. Bunga lavender sering digunakan sebagai pengharum ruangan, bahan dalam produk perawatan tubuh, atau sebagai bahan tambahan dalam masakan. Selain aromanya yang harum, lavender juga memiliki sifat menenangkan dan digunakan dalam aromaterapi.",
        200
    ),

    Plants(
        "11",
        "Mentimun",
        "buah",
        "https://images.unsplash.com/photo-1562938292-792f6ec7adef?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8bWVudGltfGVufDB8fDB8fHw%3D&auto=format&fit=crop&w=600&q=60",
        "Musim Panas",
        4500,
        "Mentimun adalah tanaman yang paling baik ditanam di musim panas. Mentimun merupakan tanaman merambat dengan buah berbentuk silinder yang segar. Tanaman mentimun membutuhkan sinar matahari penu.",
        popularity = 452
    ),
)
