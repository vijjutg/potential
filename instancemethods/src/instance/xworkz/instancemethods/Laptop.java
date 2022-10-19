package instance.xworkz.instancemethods;

public class Laptop {

	public String[] appNames;
	public int pictures;
	public int screenShots;
	public int[] savedphotos;
	public int pdfs;
	public double[] memoryConsumed;
	public String[] movieNames;
	public int desktopFiles;
	public int[] songs;
	public String ownerName;
	public double price;

	public Laptop(String[] appNames, int pictures, int screenShots, int[] savedphotos, int pdfs,
			double[] memoryConsumed, String[] movieNames, int desktopFiles, int[] songs, String ownerName,
			double price) {

		this.appNames = appNames;
		this.pictures = pictures;
		this.screenShots = screenShots;
		this.savedphotos = savedphotos;
		this.pdfs = pdfs;
		this.memoryConsumed = memoryConsumed;
		this.movieNames = movieNames;
		this.desktopFiles = desktopFiles;
		this.songs = songs;
		this.ownerName = ownerName;
		this.price = price;

	}

	public void display() {

		System.out.println(pictures);
		System.out.println(screenShots);
		System.out.println(pdfs);
		System.out.println(desktopFiles);
		System.out.println(ownerName);
		System.out.println(price);

		for (int i = 0; i < this.appNames.length; i++) {
			String string = this.appNames[i];
			System.out.println(string);
		}

		for (int i = 0; i < this.savedphotos.length; i++) {
			int number = this.savedphotos[i];
			System.out.println(number);
		}

		for (int i = 0; i < this.memoryConsumed.length; i++) {
			double memory = this.memoryConsumed[i];
			System.out.println(memory);
		}

		for (int i = 0; i < this.movieNames.length; i++) {
			String movie = this.movieNames[i];
			System.out.println(movie);
		}

		for (int i = 0; i < this.songs.length; i++) {
			int number = this.songs[i];
			System.out.println(number);
		}

	}

}
