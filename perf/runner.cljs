(ns runner
  (:require
   [cljs-time.format :as f]))

(def dates
  {:basic-date "20160409"
   :basic-date-time "20160409T122801.000Z"
   :basic-date-time-no-ms "20160409T122801Z"
   :basic-ordinal-date "2016001"
   :basic-ordinal-date-time "20160010001.100Z"
   :basic-ordinal-date-time-no-ms "20160010001Z"
   :basic-time "123456.003Z"
   :basic-time-no-ms "123456Z"
   ;; :basic-t-time (formatter "'T'HHmmss.SSSZ")
   ;; :basic-t-time-no-ms (formatter "'T'HHmmssZ")
   ;; :basic-week-date (formatter "xxxx'W'wwe")
   ;; :basic-week-date-time (formatter "xxxx'W'wwe'T'HHmmss.SSSZ")
   ;; :basic-week-date-time-no-ms (formatter "xxxx'W'wwe'T'HHmmssZ")
   ;; :date (formatter "yyyy-MM-dd")
   ;; :date-element-parser (not-implemented 'dateElementParser)
   ;; :date-hour (formatter "yyyy-MM-dd'T'HH")
   ;; :date-hour-minute (formatter "yyyy-MM-dd'T'HH:mm")
   ;; :date-hour-minute-second (formatter "yyyy-MM-dd'T'HH:mm:ss")
   ;; :date-hour-minute-second-fraction (formatter "yyyy-MM-dd'T'HH:mm:ss.SSS")
   ;; :date-hour-minute-second-ms (formatter "yyyy-MM-dd'T'HH:mm:ss.SSS")
   ;; :date-opt-time (not-implemented 'dateOptionalTimeParser)
   ;; :date-parser (not-implemented 'dateParser)
   ;; :date-time (formatter "yyyy-MM-dd'T'HH:mm:ss.SSSZZ")
   ;; :date-time-no-ms (formatter "yyyy-MM-dd'T'HH:mm:ssZZ")
   ;; :date-time-parser (not-implemented 'dateTimeParser)
   ;; :hour (formatter "HH")
   ;; :hour-minute (formatter "HH:mm")
   ;; :hour-minute-second (formatter "HH:mm:ss")
   ;; :hour-minute-second-fraction (formatter "HH:mm:ss.SSS")
   ;; :hour-minute-second-ms (formatter "HH:mm:ss.SSS")
   ;; :local-date-opt-time (not-implemented 'localDateOptionalTimeParser)
   ;; :local-date (not-implemented 'localDateParser)
   ;; :local-time (not-implemented 'localTimeParser)
   ;; :ordinal-date (formatter "yyyy-DDD")
   ;; :ordinal-date-time (formatter "yyyy-DDD'T'HH:mm:ss.SSSZZ")
   ;; :ordinal-date-time-no-ms (formatter "yyyy-DDD'T'HH:mm:ssZZ")
   ;; :time (formatter "HH:mm:ss.SSSZZ")
   ;; :time-element-parser (not-implemented 'timeElementParser)
   ;; :time-no-ms (formatter "HH:mm:ssZZ")
   ;; :time-parser (formatter 'timeParser)
   ;; :t-time (formatter "'T'HH:mm:ss.SSSZZ")
   ;; :t-time-no-ms (formatter "'T'HH:mm:ssZZ")
   ;; :week-date (formatter "xxxx-'W'ww-e")
   ;; :week-date-time (formatter "xxxx-'W'ww-e'T'HH:mm:ss.SSSZZ")
   ;; :week-date-time-no-ms (formatter "xxxx-'W'ww-e'T'HH:mm:ssZZ")
   ;; :weekyear (formatter "xxxx")
   ;; :weekyear-week (formatter "xxxx-'W'ww")
   ;; :weekyear-week-day (formatter "xxxx-'W'ww-e")
   ;; :year (formatter "yyyy")
   ;; :year-month (formatter "yyyy-MM")
   ;; :year-month-day (formatter "yyyy-MM-dd")
   ;; :rfc822 (formatter "EEE, dd MMM yyyy HH:mm:ss Z")
   :mysql "2016-04-08 12:34:56"
   })

(dotimes [_ 100]
  (doseq [[date-key date-str] dates]
    (f/parse (f/formatters date-key) date-str)))
