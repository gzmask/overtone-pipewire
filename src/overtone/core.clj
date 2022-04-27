(ns overtone.core
  (:require [overtone.live :as ol]))

(ol/demo (ol/saw 440))

(ol/recording-start "a.wav")
(ol/recording-stop)
(ol/defsynth my-sin [freq 440]
  (ol/out 0 (ol/pan2 (ol/sin-osc freq))))

(my-sin)
(ol/kill my-sin)
((ol/sample "~/Downloads/drum/OH/kick_OH_P_1.wav"))
(ol/load-sample "~/Downloads/drum/OH/kick_OH_P_1.wav")
