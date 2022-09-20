import java.util.Scanner;

public class VIDu {
	public static void main(String[] args) {
// bài 2: nhập 1 số nguyên dương n, kiểm tra xem số đó là chẵn hay lẻ 
		// âm hay dương, in kết quả ra màn hình kết luận trên 1 dòng

//	Scanner sc = new Scanner(System.in);
// System.out.println("nhap 1 so nguyen duong a: ");		
//  int a = sc.nextInt();
//  if(a % 2 == 0) {
//	  System.out.println("so chan");	  
//  } else {
//	  System.out.println("so le");
//  }
//  if (a >= 0) {
//	  System.out.println("nguyen duong");
//  } else {
//	  System.out.println("nguyen am");
//  }

		// bài 3 : nhập 2 số nguyên a và b. In ra tổng tích thương hiệu. Lưu ý khi xử lý
		// phép chia
		// sẽ cần ép kiểu, kiểm tra mẫu khác 0. Xuất kết quả ra màn hình

//	Scanner sc = new Scanner(System.in);
//	 System.out.println("nhap 1 so nguyen duong a: ");		
//	  int a = sc.nextInt();
//	  System.out.println("nhap 1 so nguyen duong b: ");		
//	  int b = sc.nextInt();
//	  
//	  int tong = a + b;
//	  System.out.println("a + b = " + tong);
//	  
//	  int hieu = a - b;
//	  System.out.println("a - b = " + hieu);
//	  
//	  int nhan = a * b;
//	  System.out.println("a * b = " + nhan);
//	  
//	  float thuong = (float)a / b;
//	  if ( b % 2 == 0) {
//		  System.out.println("a chia b vo nghiem ");
//	  }
//	  System.out.println("a / b = " + thuong);

// bài 4 ;nhập 2 số nguyên a và b. So sánh xem số nào lớn hơn số nào nhỏ hơn hay 2 số bằng nhau. 
		// in kết quả ra màn hình

//	Scanner sc = new Scanner(System.in);
//	 System.out.println("nhap 1 so nguyen duong a: ");		
//	  int a = sc.nextInt();
//	  System.out.println("nhap 1 so nguyen duong b: ");		
//	  int b = sc.nextInt();
//	  
//	  if (a > b) {
//		  System.out.println("a > b");
//	  } else if (a < b) {
//		  System.out.println("a < b");
//	  } else {
//		  System.out.println("a = b");
//	  }  

// bài 5 : Nhập 4 giá trị a, b , c ,d . Tìm giá trị lớn nhất của chúng và gán
		// giá trị của chúng cho biến max.
		// In ra trị lớn nhất của chúng ra màn hình. Trong trường hợp 4 số bằng nhau thì
		// in ra không có giá trị lớn nhất.

//	Scanner sc = new Scanner(System.in);
//	 System.out.println("nhap a = ");		
//	  int a = sc.nextInt();
//	 System.out.println("nhap b = ");		
//	  int b = sc.nextInt();
//	  System.out.println("nhap c = ");		
//	  int c = sc.nextInt();
//	  System.out.println("nhap d = ");		
//	  int d = sc.nextInt();
//	  
//	  int max1 = Math.max(a, b );
//	  int max2 = Math.max(c, d);
//	  int max = Math.max(max1, max2);
//	  
//	  int x = a = b;
//	  int y = c = d;
//	  
//	  if (x == y) { 
//		  System.out.println("khong co gia tri nao lon nhat");
//	  } else {
//		  System.out.println(" max a, b, c, d = " + max);
//	  }

// bài 6 : Viết chương trình nhập 2 cạnh hình chữ nhật và tính chu vi diện tích hình chữ nhật đó. 
// hiển thị kết quả ra màn hình 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("chieu dai = ");
//		int a = sc.nextInt();
//
//		System.out.println("chieu rong = ");
//		int b = sc.nextInt();
//
//		while (a <= 0 || b <= 0) {
//			System.out.println("khong tinh duoc chu vi!");
//			return;
//		}
//		while (a == b) {
//			System.out.println("nhap a va b khac nhau!");
//			return;
//		}
//		while (a < b) {
//			System.out.println("nhap chieu dai phai lon hon chieu rong");
//			return;
//		}
//
//		int chuVi = (a + b) * 2;
//		System.out.println("chu vi hinh chu nhat = " + chuVi);
//		int dienTich = a * b;
//		System.out.println("dien tich hinh chu nhat = " + dienTich);

// bài 7 ; viết chương trình nhập bán kinh của hình tròn và tính chu vi diện tích hình tròn đó.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap ban kinh r = ");
//		double r = sc.nextDouble();
//		
//		while (r <= 0) {
//			System.out.println("khong the tao ra hinh tron!");
//			return;
//		}
//		double chuVi = 2 * r * Math.PI;
//		System.out.println("chu vi hinh tron = " + chuVi);
//		
//		double dienTich = r * r * Math.PI;
//		System.out.println("dien tich hinh tron = " + dienTich);

// bài 8 : giải và biện luận phương trình bậc nhất ax + b = 0
		// nếu a = 0 thì
		// b = 0 thì phương trình vô số nghiệm || nếu b != 0 thì phương trình vô nghiệm
		// nếu a != 0 thì phương trình có nghiệm = -b/a

//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap gia tri a = ");
//		double a = sc.nextDouble();
//		System.out.println("nhap gia tri b = ");
//		double b = sc.nextDouble();
//		
//		if (a == 0 && b == 0) {
//			System.out.println("phuong trinh vo so nghiem");
//		} else if (a == 0 && b != 0) {
//			System.out.println("phuong trinh vo nghiem");
//		} else if (a != 0 && b == 0) {
//			System.out.println("phuong trinh co nghiem x = 0");
//		} else {
//			System.out.println("phuong trinh co nghiem x = " + (-b / a));
//		}

// bài 9 : giải và biện luận phương trình ax^2 + bx + c = 0
		// các biến cần có là a , b, c, x1,x2, delta
		// làm điều kiện để a luôn dương và a phải > 0
		// kiểm tra delta
		// delta < 0 thì phương trình vô nghiệm
		// delta = 0 phương trình có nghiệm kép x1 = x2 = - b/2a
		// delta > 0 phương trình có 2 nghiệm x1 = (- b - sqrt(delta)) / (2a)
		// x2 = (- b + sqrt(delta)) / (2a)

//		double a, b, c, x1, x2, delta, n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap a = ");
//		a = sc.nextDouble();
//		while (a == 0) {
//			System.out.println("phai nhap a != 0");
//		return;	
//		}
//      System.out.println("nhap b = ");
//		b = sc.nextDouble();
//		System.out.println("nhap c = ");
//		c = sc.nextDouble();
//		
//		delta = Math.pow(b, 2) - 4 * a * c;
//		x1 = ( - b - Math.sqrt(delta)) / (2 * a);
//		x2 = ( - b + Math.sqrt(delta)) / (2 * a);
//		n =x1 = x2 = - b / (2 * a);
//		
//		if (delta < 0) {
//			System.out.println("phuong trinh vo nghiem!");
//		} else if (delta == 0) {
//			System.out.println("phuong trinh co nghiem kep x1 = x2 = " + n);
//		} else {
//			System.out.println("phuong trinh co 2 nghiem");
//			System.out.println("x1 = " + x1);
//			System.out.println("x2 = " + x2);
//		}

// bài 10 : nhập 3 số a, b ,c là 3 số thực không âm. 
		// kiểm tra xem nó có phải 3 cạnh của tam giác hay không ?
        
		float a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a = ");
		a = sc.nextFloat();
		System.out.println("nhap b = ");
		b = sc.nextFloat();
		System.out.println("nhap c = ");
		c = sc.nextFloat();
		
		while (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("nhap a, b va c phai la so duong!");
			return;
		}
	}
}
