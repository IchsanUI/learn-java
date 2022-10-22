/**
 * Test_Kerja_2
 */

public class Test_Kerja_2 {

    public static void main(String[] args) {
        String kalimat = "FRONTEND DEVELOPER";
        String Ers = kalimat.replaceAll("[\s]","-");
        char[] resultarray = Ers.toCharArray();
        for (int i = resultarray.length - 1; i >= 0; i--){
            System.out.print(resultarray[i]);
        }

    }
}

// VERSI JAVASCRIPT
// const kalimat = 'FRONTEND DEVELOPMENT';
// const outStr = kalimat.replaceAll(/\s/g, '-');
// let simpan = '';
// for (var i = outStr.length - 1; i >= 0; i--) {
//   simpan += outStr[i];
// }
// console.log(simpan);

// String Regex
// Kelas Karakter
// [ abc] = karakter a ,b atau c (kelas sederhana)
// [^abc] = kecuali karakter a ,b ,atau (negasi)
// [a-zA-Z] = karakter a sampai z huruf kecil , atau A sampai Z huruf besar ,(jarak)
// [a-z[x-y]] = karakter a sampai d ,atau m sampai p (a-xy-z : gabungan)
// [a-z0-9] = karakter a sampai z ,atau angka dari 0 sampai 9
// [a-z&&[^bc] = karakter a sampi z, kecuali untuk b dan c.

// Meta Karakter
// . = tanda titik ,yang berarti karakter apa saja
// \d = angka digit apa saja:, seperti [0-9]
// \D = selain angka digit : [^0-9]
// \s = sebuah spasi pada kaarkter, seperti [ \t\n\x0B\f\r]
// \S = selain spasi pada karakter: [^\s]
// \w = huruf dan angka apa saja ,seperti [a-zA-Z_0-9]
// \W = selain angka dan huruf ,[\w]

// Batasan Kecocokan Karakter
// ^ = tanda awalan
// $ = tanda akhiran
// \b = batasan kecocokan kata
// \B = batasan kecocokan selain kata
// \A = awalan untuk input text
// \G = akhir dari kecocokan sebelumnya
// \Z = akhir dari input text, kecuali final terminator jika ada
// \z = akhir dari input text
