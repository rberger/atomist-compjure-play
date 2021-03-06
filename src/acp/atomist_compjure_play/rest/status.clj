(ns acp.atomist-compjure-play.rest.status
  (:require [schema.core :as s]
            [ring.util.http-response :refer [ok]])
  (:require [acp.atomist-compjure-play.models.status :as model]))

;
; Stuff related to the status of this service and its dependencies
;

(s/defn get-status :- s/Any
  "Return the status response"
  [config]
  (ok {:status  "OK"
       :version (:version config)}))
