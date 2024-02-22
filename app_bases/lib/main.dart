import 'package:flutter/material.dart';

import 'package:app_bases/gradient_container.dart';

const color1 = Color.fromARGB(255, 26, 2, 80);
const color2 = Color.fromARGB(255, 45, 7, 98);

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        body: GradientContainer(
          color1, 
          color2
        )
      ),
    ),
  );
}
