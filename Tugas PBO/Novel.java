class Novel {
	String title, writer, desc;
	int year, buyPrice, sellPrice;
	
	//constructor
	Novel(String t, String w, String d, int y, int bp){
		this.title = t;
		this.writer = w;
		this.desc = d;
		this.buyPrice = bp;
	}
	
	void showTitle() {
		System.out.println("Title: " + this.title);
	}
	
	void showItemData() {
		System.out.println("Title: " + this.title);
		System.out.println("Writer: " + this.writer);
		System.out.println("Descriptions: " + this.desc);
		System.out.println("Year Out: " + this.year);
		System.out.println("Bought Price: " + this.buyPrice);
	}
		
}

class Main {
  public static void main(String[] args) {

    Novel[] obj = new Novel[3];
		obj[0] = new Novel(
            "Dunia Sophie",
            "Jostein Gaarder", 
            "Dunia sophie adalah sebuah novel filsafat. berkisah tentang seorang gadis berusia 14 tahun yang sebelumnya hidup dengan wajar seperti anak-anak seusianya, hingga suatu ketika ia dikirimi surat misterius berisi pertanyaan-pertanyaan filsafat. Selanjutnya buku ini akan membawa kita ke dalam dunia filsafat, menembus sejarah mulai dari masa jahiliyah dimana orang-orang hanya percaya pada dewa hingga masa dimana kita berdiri saat ini.", 
            1996, 
            108000
        );
        obj[1] = new Novel(
            "Sapiens: A Brief History of Humankind",
            "Yuval Noah Harari", 
            "Sekitar 13,5 miliar tahun lalu, materi, energi, waktu dan ruang hadir melalui Dentuman Besar (Big Bang). Sekitar 300.000 tahun setelahnya, materi dan energi mulai menyatu membentuk struktur yang kompleks, yang dinamai atom, yang lalu berkombinasi membentuk molekul. Sekitar 3,8 miliar tahun lalu, di planet bernama Bumi, molekul-molekul tertentu membentuk struktur besar dan rumit yang dinamai organisme. Sekitar 70.000 tahun lalu, organisme menjadi bagian dari spesies Homo sapiens, membentuk struktur yang dinamai kebudayaan. Perkembangan selanjutnya dari kebudayaan manusia itu dinamai sejarah.",
            2011, 
            219000
        );
        obj[2] = new Novel(
            "A Brief History of Time",
            "Stephen Hawking", 
            "Inilah salah satu buku sains terpenting yang ditulis oleh satu di antara para ilmuwan besar zaman kita, Stephen Hawking. Dalam buku ini Hawking membahas pertanyaan-pertanyaan besar seperti: Bagaimana alam semesta bermula—dan apa yang memulainya? Apakah waktu itu dan apakah ia selalu bergerak maju? Adakah ujung alam semesta, dalam ruang maupun waktu? Adakah dimensi lain dalam alam semesta? Apa yang terjadi ketika alam semesta berakhir? Lewat penulisan yang bisa dimengerti semua orang, A Brief History of Time mengajak kita menjelajahi dunia ajaib lubang hitam dan kuark, antizat dan “panah waktu�?, ledakan besar dan peran Tuhan di alam semesta beserta segala kemungkinan yang luar biasa dan tak terduga. Dengan penggambaran yang menarik dan menggugah imajinasi, Stephen Hawking membawa kita makin dekat ke rahasia pamungkas penciptaan alam semesta.",
            1988, 
            70000
        );
		
		System.lineSeparator();
		System.out.println("=================");
		System.out.println("Data List: ");
		System.out.println("=================");
		for(int z = 0; z < 3; z++) {
			obj[z].showItemData();
		}
	}
}