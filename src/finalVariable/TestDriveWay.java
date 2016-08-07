package finalVariable;

public class TestDriveWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriveWay dave = new DriveWay();
		int sizePrevious = dave.driveWaySize = 11;
		System.out.println(sizePrevious);
		
		DriveWay susan = new DriveWay();
		System.out.println(susan.driveWaySize);
		int sizeCurrent = susan.driveWaySize = 12;
		System.out.println(sizeCurrent);
		System.out.println(dave.driveWaySize);
	}

}
