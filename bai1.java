	gói  Baitap ;
nhập  java . sử dụng . Máy quét ;
 lớp  công khai bai1 
{
	public  static  void  main ( String [] args ) {
		Hệ thống . ra ngoài . println ( "bai 1" );
		Máy quét  sc = Máy quét mới  ( Hệ thống . In );
		Hệ thống . ra ngoài . print ( "nhap vao so a:" );
		int  a = sc . nextInt ();
		Hệ thống . ra ngoài . print ( "nhap vao so b:" );
		int  b = sc . nextInt ();
		Hệ thống . ra ngoài . println ( "a + b =" + ( a + b ));
		Hệ thống . ra ngoài . println ( "a - b =" + ( a - b ));
		Hệ thống . ra ngoài . println ( "a * b =" + ( a * b ));
		Hệ thống . ra ngoài . println ( "a / b =" + ( a / b ));
		Hệ thống . ra ngoài . println ( "a% b =" + ( a % b ));
		Hệ thống . ra ngoài . println ( "so sánh 2 so a vŕ b:" );
		if ( a == b ) { Hệ thống . ra ngoài . print ( "a == b" );}
        else  if ( a <= b ) { Hệ thống . ra ngoài . print ( "a <= b" );}
		else  if ( a > = b ) { Hệ thống . ra ngoài . print ( "a> = b" );}
	}
}
