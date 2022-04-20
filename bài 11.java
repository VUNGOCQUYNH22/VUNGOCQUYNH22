gói  mồi bản ;
nhập  java . sử dụng . Máy quét ;
 lớp  công khai bai11 {
    public  static  void  main ( String [] args ) {
        Máy quét  sc = Máy quét mới  ( Hệ thống . In );
        int  n ;
        làm {
        Hệ thống . ra ngoài . print ( "nhap vao so pt:" );
         n = sc . nextInt ();
        nếu ( n < 100 ) {
            int [] a = new  int [ n ];
            for ( int  i = 0 ; i < n ; i ++) {
                Hệ thống . ra ngoài . print ( "nhap pt a [" + ( i + 1 ) + "]:" );
                a [ i ] = sc . nextInt ();
            }
            Hệ thống . ra ngoài . print ( "mang nhap vao:" );
            for ( int  i = 0 ; i < n ; i ++) {
                Hệ thống . ra ngoài . print ( a [ i ] + "" );
            }
            int  tg ;
            for ( int  i = 0 ; i < n - 1 ; i ++) {
                for ( int  j = i + 1 ; j < n ; j ++) {
                    if ( a [ i ]> a [ j ]) {
                        // Hoan vi 2 so a [i] va a [j]
                        tg = a [ i ];
                        a [ i ] = a [ j ];
                        a [ j ] = tg ;        
                    }
                }
            }
            Hệ thống . ra ngoài . println ( "\ n sắp xếp lại các mảng theo thứ tự tăng dần:" );
            for ( int  i = 0 ; i < n ; i ++) {
               Hệ thống . ra ngoài . printf ( "% 5d" , a [ i ]);
            }

        } khác {
            Hệ thống . ra ngoài . println ( "nhap lai n !!!" );
        }
        } while ( n > 100 );







     }
}
