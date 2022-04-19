/* Convert a given binary string
 * into the equivalent decimal value.
 * returns an int representing the decimal value
 * of the binary string
 *
 * Ex: "1101"
 * 
 * Bits:        1    1    0    1
 *
 * Place:       2^3  2^2  2^1  2^0
 * 
 * Place value: 8    4    2    1
 * 
 * Compute decimal value: 1*(8) + 1*(4) + 0*(2) + 1*(1) = 13
 */
public int binaryToDecimal(String binaryString)
{
    // Write your code here!
    return Integer.parseInt(binaryString,2);
}