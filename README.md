# MvpSample
一个简单的、遵循Google的 [todomvp](https://github.com/googlesamples/android-architecture/tree/todo-mvp/
) 样式的Android MVP架构的demo。    

它的中心思想很简单啦，就是View跟Model不直接沟通（直接沟通的话就成了MVC），通过Presenter更新Model和View。

---

A simple android mvp architecture demo, implementation/imitation/simplification of google's [todomvp](https://github.com/googlesamples/android-architecture/tree/todo-mvp/
) app.  

It's simple to understand the critical point of MVP: View doesn't contact wiht Model directly(if it does, it would be MVC), it uses Presenter to connect the view and model.    

---

It looks like this:    
![eg](https://github.com/LarryLawrence/SimpleBottomNavigationBar/blob/master/screenshots/Screenshot_20161214-200815.png)    

Just click the floating action button in the bottom right corner, the ```presenter``` is gonna update the ```model```and the ```view```.

    
您可以参考这里：https://larrylawrence.github.io/2016/12/13/EP17-MvpSample/.

For more information, please check https://larrylawrence.github.io/2016/12/13/EP17-MvpSample/.

```
Simple MvpSample library for Android
Copyright (c) 2016 DrunkPiano.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
```