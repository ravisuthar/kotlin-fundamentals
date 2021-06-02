package com.cs


// ‘lazy initialization’ was designed to prevent unnecessary initialization of objects.
// You variables will not be initialised unless you use it in your code
// It is initialized only once. Next time when you use it, you get the value from cache memory.

// It is thread safe
// It is initialized in the thread where it is used for the first time.
// Other threads use the same value stored in the cache

// The variable can be var or val.
// The variable can be nullable or non-nullable


// lateinit used only with mutable data type [ var ]
// lateinit used only with non-nullable data type
// lateinit values must be initialised before you use it
// If you try to access lateinit variable without initializing it then it throws UninitializedPropertyAccessException


fun compute(n: Int): Int {
    print("...is called")
    return n * 2
}


fun main() {

    val temp by lazy { compute(7) }

    if (Math.random() > 5) {
        print("if condition excuted")
        print(temp)
    } else {
        print("not need")
    }
}