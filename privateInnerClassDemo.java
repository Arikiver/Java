// Unlike a "regular" class,
// an inner class can be private or protected.
// If you don't want outside objects to access the inner class,
// declare the class as private

//--------------------------------------------------------------------------------------

// class OuterClass {
//     int x = 10;
//     private class InnerClass {
//       int y = 5;
//     }
//   }

//   public class privateInnerClassDemo {
//     public static void main(String[] args) {
//       OuterClass myOuter = new OuterClass();
//       OuterClass.InnerClass myInner = myOuter.new InnerClass();
//       System.out.println(myInner.y + myOuter.x);
//     }
//   }

// This gives out an error: OuterClass.InnerClass has private access in OuterClass.

//--------------------------------------------------------------------------------------

class OuterClass {
    int x = 10;
    class InnerClass {
      int y = 5;
    }
  }

  public class privateInnerClassDemo {
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.new InnerClass();
      System.out.println(myInner.y + myOuter.x);
    }
  }

// While this code will work fine cause the inner class is not private