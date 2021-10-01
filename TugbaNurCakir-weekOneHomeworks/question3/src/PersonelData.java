import java.time.LocalDate;
class PersonelData {

        private LocalDate birthDate;
        private String address;
        private long ssn;

        PersonelData(LocalDate birthDate, long ssn) {

        }
        PersonelData(int year, int month, int day, long ssn){
                this.birthDate = LocalDate.of(year,month,day);
        }

        public LocalDate getBirthDate(){

                return birthDate;
        }
        public long getSSN() {

                return ssn;
        }
        public String getAddress() {
                return address;
        }
        public String setAddress(){
                return this.address = address;
        }
}