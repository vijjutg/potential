package com.xworkz.copy.boot;

import com.xworkz.copy.Song;

public class SongRunner {

	public static void main(String[] args) {
		Song ref = new Song();
		
		ref.name = "E sundara";
		ref.language = "Kannada";
		ref.singer = "S P Balasubramanyam";
		ref.lyrics = "E sundara beladingala e tampina angaladali ....";
		ref.type = "Melody";
		
		System.out.println("The name of song is : "+ ref.name );
		System.out.println("The language of song is : "+ ref.language );
		System.out.println("The singer of song is : "+ref.singer );
		System.out.println("The name of lyrics is : "+ ref.lyrics);
		System.out.println("The type of song is : "+ ref.type );

	}

}
