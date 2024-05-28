# Java-CNN

# Neural Network

Percptron: A perceptron takes several binary inputs, x1, x2, x3, and produces a single binary output.

output = {
              0 if ∑(wixi) <= threshold
              1 if ∑(wixi) > threshold
          }

Weights: Each neuron is connected to all the neurons in the previous layer, and the weights in the weighted sum defining its activation are the strengths of those connections.

Bias: Is indication of whether that neuron has the affinity of being active or inactive.

Activation function: A function that transforms the input signals from the previous layers and out put it as the input signal of the current layer.

We start by initializing the weights and biases randomly. The initial performance will be poor because the weights and biases are random. 

We will define a cost function, allowing us to tell the neural network how well the activation function performing. The goal is to adjust the weights and biases to minimize the cost function.

The cost function we will use is the sum of the squared differences between the desired output and the actual output.

Eg.

    If the actual output is 7.

    | Actual Output | Expected output | Cost (Actual - Expected)^2 |
    | ------------- | --------------- | -------------------------- |
    |     0.82      |       0.00      |           0.67             |
    |     0.63      |       0.00      |           0.40             |
    |     0.89      |       0.00      |           0.79             |
    |     0.57      |       0.00      |           0.32             |
    |     0.91      |       0.00      |           0.83             |
    |     0.78      |       0.00      |           0.61             |
    |     0.82      |       0.00      |           0.67             |
    |     0.89      |       1.00      |           0.01             |
    |     0.93      |       0.00      |           0.86             |
    |     0.86      |       0.00      |           0.74             |
    |---------------|-----------------|----------------------------|


We will perform some sort of gradient descent to minimize the cost function. We will adjust the weights and biases in the direction that reduces the cost function. We will do this by calculating the gradient of the cost function with respect to the weights and biases.

There is a chance that we will get stuck in a local minimum rather than the global minimum depending on the starting point of the weights and biases.

The gradient of a function gives the direction of the steepest ascent. To find the direction of the steepest descent, we will take the negative of the gradient. The magnitude/length of the gradient gives the steepness of the ascent/descent.

The algorithm for computing this gradient efficiently is called backpropagation.

It is important to have a cost function that produces a smooth output so we can find a local minimum by making small adjustments to the weights and biases. This is why the neurons of the neural network have continuously ranging activation functions rather than being active or inactive(binary, which is what biological neurons are).

## Gradient Descent
Gradient descent: Adjusting the weights and biases in the opposite direction of the gradient of the cost function.

The direction and magnitude of the gradient tells us which weights and biases have the most influence in steering the neural network in predicting the wrong output. This is because we perform the dot product of the gradient and the weights and biases to determine the direction and magnitude of the adjustment.

## Back Propagation
Back propagation: The algorithm for computing the gradient of the cost function with respect to the weights and biases efficiently.

oi = σ(∑(wijaj) + bi)

Parameters that you can change
- Increase bi

- Increase wij
Increase in proportion to ai

- Change ai

"Neurons that fire together, wire together"

### Intuition

The phrase "Neurons that fire together, wire together" is often attributed to Donald Hebb, a Canadian neuropsychologist. He proposed this theory, known as Hebb's rule or Hebbian theory, in his 1949 book "The Organization of Behavior: A Neuropsychological Theory". The theory suggests that the connections between neurons strengthen when they fire simultaneously, which is a fundamental concept for learning and memory processes in the brain.

If the prediction is wrong, we will decrease the weights from the activation functions that are firing and increase the weights from the activation functions that are not firing.

Back propagation works by adding up the affects of increasing or decreasing the weights that occurs in the subsequent layers.

