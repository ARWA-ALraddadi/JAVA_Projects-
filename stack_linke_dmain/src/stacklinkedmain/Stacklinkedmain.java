
package stacklinkedmain;

/**
 *
 * @author TOSHIBA
 */
public class Stacklinkedmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkListStack st = new LinkListStack();

    st.push(50);
    st.push(70);
    st.push(190);
    st.displayStack();
    st.pop();
    st.push(10);
    st.displayStack();

  }
    }
    
