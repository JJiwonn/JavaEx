package com.javaex.oop.song.v2;
// v1. 필드, 게터세터, 일반 메서드
public class SongApp {

	public static void main(String[] args) {
//		Song s1 = new Song();
		Song s1 = new Song("아이유",
				"좋은날",
				"Real",
				"이민수",
				2010,
				3);
//		s1.setArtist("아이유");
//		s1.setTitle("좋은날");
//		s1.setAlbum("Real");
//		s1.setYear(2010);
//		s1.setTrack(3);
//		s1.setComposer("이민수");
		
//		Song s2 = new Song();
		Song s2 = new Song("BIGBANG",
				"거짓말",
				"Always",
				"G-DRAGON",
				2007,
				2);
//		s2.setArtist("BIGBANG");
//		s2.setTitle("거짓말");
//		s2.setAlbum("Always");
//		s2.setYear(2007);
//		s2.setTrack(2);
//		s2.setComposer("G-DRAGON");

//		Song s3 = new Song();
		Song s3 = new Song("버스커버스커",
				"벚꽃엔딩",
				"버스커버스커1집",
				"장범준",
				2012,
				4);
//		s3.setArtist("버스커버스커");
//		s3.setTitle("벚꽃엔딩");
//		s3.setAlbum("버스커버스커1집");
//		s3.setYear(2012);
//		s3.setTrack(4);
//		s3.setComposer("장범준");
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
