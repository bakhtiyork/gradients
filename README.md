# Gradients
A curated collection of splendid gradients made in Kotlin (port of [https://webgradients.com](https://webgradients.com) for Android). Only linear gradients included for now.

## Sample app
 <a href="https://play.google.com/store/apps/details?id=com.bakhtiyor.gradients.demo"><img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" width="120"></a>

<img alt="Screenshot1" src="https://raw.githubusercontent.com/bakhtiyork/gradients/master/misc/screenshot1.png" width="320">

## Installation
Add to dependencies in gradle file
```
implementation 'com.bakhtiyor.gradients:gradients:0.1.0'
```

## How To Use
```
view.drawable = Gradients.warmFlame()
```
You can set drawable shape:
```
view.drawable = Gradients.warmFlame().apply { shape = OvalShape() }
```

## TODO
Implement radial and blended gradients.

## Gredits
* [webgradients](https://github.com/itmeo/webgradients) by [itmeo](https://github.com/itmeo)

## License
Gradients is available under the MIT license.