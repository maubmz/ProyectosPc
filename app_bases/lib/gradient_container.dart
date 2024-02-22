//import 'package:app_bases/styled_text.dart';

import 'package:flutter/material.dart';

const startAlignment = Alignment.topLeft;
const endAlignment = Alignment.bottomRight;

class GradientContainer extends StatelessWidget {
  GradientContainer(this.color1, this.color2, {super.key});

  GradientContainer.purple({super.key})
      : color1 = Colors.deepPurple,
        color2 = Colors.indigo;

  final Color color1;
  final Color color2;
  var activeDiceImage = 'assets/images/dice-1.png';

  rollDice() {
    activeDiceImage = 'assets/images/dice-4.png';
    print("Change the image");
  }

  @override
  Widget build(context) {
    return Container(
      decoration: BoxDecoration(
        gradient: LinearGradient(
          colors: [color1, color2],
          begin: startAlignment,
          end: endAlignment,
        ),
      ),
      child: Center(
        // child: StyledText('Hello World!'),
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Image.asset(
              activeDiceImage,
              width: 200,
            ),
            // const SizedBox(height: 20), // para dar espacio entre boton y dado
            TextButton(
              onPressed: rollDice,
              // Texto del boton
              style: TextButton.styleFrom(
                padding: const EdgeInsets.only(
                  top: 34,
                ),
                foregroundColor: Colors.white,
                textStyle: const TextStyle(
                  fontSize: 28,
                ),
              ),
              child: const Text('Roll Dice'),
            ),
          ],
        ),
      ),
    );
  }
}
