
package assignment1;

/**
 *
 * @author 2279654
 */
class ZipCode {
    public int Zip;
    
    public ZipCode(int zip) {
        int dig = String.valueOf(zip).length();
        
        if (dig > 5) {
            System.out.println(zip + " zip code is more than 5 digits.");
        }
        
       
            this.Zip = zip;
        
    }
    
    /**
     * stores the bar code as an integer
     * @param barcode the bar code to be parsed
     */
    public ZipCode(String barcode) {
        if (barcode == null) {
            System.out.println("Invalid barcode.");
        }
        
        else {
            this.Zip = parseBarCode(barcode);
        }
    }
    
    /**
     * returns the ZIP code as a string of binary digits
     * @return the new string of binary numbers
     */
    public String GetBarCode() {
        
        String str = String.format("%05d", Zip);
        String binary = "";
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case '0': binary += "11000";break;
                case '1': binary += "00011";break;
                case '2': binary += "00101";break;
                case '3': binary += "00110";break;
                case '4': binary += "01001";break;
                case '5': binary += "01010";break;
                case '6': binary += "01100";break;
                case '7': binary += "10001";break;
                case '8': binary += "10010";break;
                case '9': binary += "10100";break;
            }
        }

        binary = '1' + binary + '1';
        return binary;
    }
    
    /**
     * decodes the binary string and returns the ZIP code as an integer
     * @return the decoded ZIP code
     */
    private int parseBarCode(String binary) {
        if (binary.length() != 27) {
            System.out.println("Error: bar code must be in multiples of 5-binary digits");
            return 0;
        }
        
        if (binary.charAt(0) != '1' || binary.charAt(binary.length() - 1) != '1') {
            System.out.println("Error: bar code missing a 1 at the start or end");
        }
        
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
                System.out.println("bar code character: " + binary.charAt(i) + " must be '0' or '1'");
            }
        }
  
        String middle = binary.substring(1,26);
        int zip = 0;
        
        for (int i = 0; i < 25; i+= 5) {
            String group = middle.substring(i, i + 5);
            
            int value = (group.charAt(0) - '0') * 7 + 
                    (group.charAt(1) - '0') * 4 +
                    (group.charAt(2) - '0') * 2 +
                    (group.charAt(3) - '0') * 1 +
                    (group.charAt(4) - '0') * 0;
            
            if (value == 11) value = 0;
            zip = zip * 10 + value;
            
            int ones = 0;
            
            for (int j = 0; j < 5; j++) {
                if (group.charAt(j) == '1') {
                    ones++;
                }
            }
            
            if (ones > 2) {
                System.out.println(group + " has invalid sequence in the bar code");
            }
        }
        
        return zip;
    }
}
