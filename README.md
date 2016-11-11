# minang.hackafarm
hula hula lalalalalalala

Ini adalah aplikasi android dari project Rangkiang yang kami buat selama Hackathon dalam rangkaian acara Hack-a-Farm Innvoation Camp 2016 di Yogyakarta dari tanggal
  6 - 12 November 2016. Project rangkiang sendiri adalah sebuah sistem monitoring sawah dengan sensor kelembaban tanah, kelembaban udara,
  hujan, dan juga bantuan kamera untuk memotret keaddan sawah. Data dari sensor ini akan diolah oleh Arduino, kemudian data tersebut dikirimkan ke perangkat Raspberry Pi yang nantinya
  menyusun data tersebut menjadi sebuah JSON script yang akan diteruskan ke layanan database Firebase. Nantinya data dari Firebase akan 
  dibaca dari aplikasi Android dan menampilkannya dalam bentuk ke grafik,angka, dan foto.
  
Aplikasi Android ini kami buat bertujuan untuk memudahkan petani memantau lokasi ladangnya (padi,cabe,dll) dengan bantuan smartphone Android,

Software yang digunakan :
  - Android Studio 2.2.2, target API 19 (Jelly Bean)
  - API Firebase
  - API GraphView (untuk menampilkan grafik di aplikasi android)

Fitur dari aplikasi ini yaitu :
  - Login and Register Account petani
  - Menampilkan data dari alat dalam bentuk grafik,angka,dan foto (read task to do)
  
 Arduino Fitur :
  - Sensor PING (untuk menguji ketinggian air)
  - Sensor RainDrop (untuk menguji ada hujan atau tidak)
  - Sensor DHT22 (Untuk kelembaban udara)
  - Sensor Soil Moisture (untuk menguji kelembaban tanah)
  - Module GSM Shield
 
 
Task to do :
  - Menghubungkan komunikasi data antara aplikasi dengan server (back-end developing)
