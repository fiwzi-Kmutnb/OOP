public class temp {
        public static void main(String[] args) {
            int hour = 8;
            int minute = 20;

            // ตำแหน่งของเข็มชั่วโมง
            double hourPosition = getHourPosition(hour, minute);

            // ตำแหน่งของเข็มนาที
            int minutePosition = getMinutePosition(minute);

            System.out.println("เวลา: " + hour + ":" + (minute < 10 ? "0" + minute : minute));
            System.out.println("เข็มชั่วโมงชี้ที่: " + hourPosition);
            System.out.println("เข็มนาทีชี้ที่: " + minutePosition);
        }

        public static double getHourPosition(int hour, int minute) {
            // เข็มชั่วโมงจะเลื่อนทุก 1/12 ของ 60 นาที ซึ่งก็คือทุก 5 นาทีจะเลื่อน 1 ช่อง
            return hour % 12 * 5 + (minute / 12.0);
//            hour + (minute / 60.0);
        }

        public static int getMinutePosition(int minute) {
            // เข็มนาทีเลื่อนได้ทุกๆ 1 นาที
            return minute;
        }
    }

