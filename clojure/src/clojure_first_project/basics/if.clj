(ns clojure-first-project.basics.if)

; if
(defn calcula-taxa-entrega
  "Se o valor da compra for até 100, deve-se cobrar 15 reais de taxa de entrega.
   Se for maior que 100 e menor que 200, 5 reais.
   Se for acima de 200, a taxa é gratuita."
  [valor-compra]
  (if (<= valor-compra 100)
    15
    (if (<= valor-compra 200)
      5
      0))
  )