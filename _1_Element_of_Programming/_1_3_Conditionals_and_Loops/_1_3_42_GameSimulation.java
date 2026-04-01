class _1_3_42_GameSimulation {
	public static void main(String[] args) {
        // Kiểm tra xem người dùng đã nhập đối số dòng lệnh n chưa
        if (args.length < 1) {
            System.out.println("Vui lòng cung cấp số lần chơi n.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int stayWins = 0;   // Số lần thắng nếu giữ nguyên (không đổi)
        int switchWins = 0; // Số lần thắng nếu đổi cửa

        for (int i = 0; i < n; i++) {
            // Giả sử có 3 cửa: 0, 1, và 2
            int prize = (int) (Math.random() * 3);  // Vị trí giấu giải thưởng
            int choice = (int) (Math.random() * 3); // Lựa chọn ban đầu của người chơi

            // Mô phỏng chiến thuật KHÔNG ĐỔI cửa:
            // Bạn chỉ thắng nếu lựa chọn ban đầu của bạn ngay lập tức trúng giải thưởng.
            if (choice == prize) {
                stayWins++;
            } 
            // Mô phỏng chiến thuật ĐỔI cửa:
            // Nếu ban đầu bạn chọn sai (tức là chọn phải cửa có dê), 
            // người dẫn chương trình BẮT BUỘC phải mở cánh cửa có con dê còn lại.
            // Do đó, cánh cửa đang đóng còn lại CHẮC CHẮN là cánh cửa có giải thưởng.
            // Vậy, cứ ban đầu chọn sai -> đổi cửa -> thành chọn đúng (thắng).
            else {
                switchWins++;
            }
        }

        // Tính toán và in ra xác suất
        double stayProb = (double) stayWins / n;
        double switchProb = (double) switchWins / n;

        System.out.println("Mô phỏng trò chơi " + n + " lần:");
        System.out.println("Xác suất thắng nếu KHÔNG ĐỔI: " + stayProb);
        System.out.println("Xác suất thắng nếu ĐỔI cửa:   " + switchProb);
    }
}