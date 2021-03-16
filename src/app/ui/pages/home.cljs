(ns app.ui.pages.home
  "Example homepage 2 3"
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma]]
            [keechma.next.helix.lib :refer [defnc]]
            ;;[keechma.next.helix.template :refer [defnt fill-slot configure]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.main :refer [Main]]
            [app.ui.components.hello :refer [Hello]]))

(defclassified HomepageWrapper :div "h-screen w-screen flex bg-gray-200")

(defnc HomeRenderer [_]
  ($ HomepageWrapper
     (d/div {:class "flex flex-1 flex-col items-center justify-center px-2 bg-[#1da1f1]"}
            "This <div> element is colored with a bg-[#1da1f1] class... Barbaric"
            ($ Main)
            ($ Hello))))

(def Home (with-keechma HomeRenderer))