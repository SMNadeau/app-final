package com.mycompany.recipeapp

data class Kind (
    val kind: String,
    val stag: String,
    val pageInfo: PageInfo,
    val items: List<Items>
)

data class PageInfo (
    val totalResults: Int,
    val resultsPerPage: Int
)

data class Items(
    val kind: String,
    val etag: String,
    val id: Id,
    val snippet: Snippet
)

data class Id (
    val kind: String,
    val videoId: String
)

data class Snippet (
    val channelId: String,
    val title: String,
    val description: String,
    val thumbnails: Thumbnails
)

data class Thumbnails (
    val default: Default,
    val medium: Medium,
    val high: High
)

data class Default (
    val url: String,
    val width: Int,
    val height: Int
)

data class Medium (
    val url: String,
    val width: Int,
    val height: Int
)

data class High (
    val url: String,
    val width: Int,
    val height: Int
)


/* {
 "kind": "youtube#searchListResponse",
 "etag": "\"Dn5xIderbhAnUk5TAW0qkFFir0M/e2M7S-xLTbXC8FxmI2Ba4tC2o-Q\"",
 "nextPageToken": "CBkQAA",
 "regionCode": "US",
 "pageInfo": {
  "totalResults": 1000000,
  "resultsPerPage": 25
 },
 "items": [
  {
   "kind": "youtube#searchResult",
   "etag": "\"Dn5xIderbhAnUk5TAW0qkFFir0M/_oFMrJSj2EdAWSJFcB_VIfLN0d4\"",
   "id": {
    "kind": "youtube#video",
    "videoId": "onglPG_dekA"
   },
   "snippet": {
    "publishedAt": "2020-04-30T19:00:23.000Z",
    "channelId": "UCo_q6aOlvPH7M-j_XGWVgXg",
    "title": "SURFING IN STYLE WITH MY GIRLFRIEND",
    "description": "PERFECT SURF SESSION OUT AT PIPELINE WITH MY GIRLFRIEND. RIDING SURFBOARDS, FLAMINGOS, AND BODYBOARDS. EVEN A MINI WOMPER ...",
    "thumbnails": {
     "default": {
      "url": "https://i.ytimg.com/vi/onglPG_dekA/default.jpg",
      "width": 120,
      "height": 90
     },
     "medium": {
      "url": "https://i.ytimg.com/vi/onglPG_dekA/mqdefault.jpg",
      "width": 320,
      "height": 180
     },
     "high": {
      "url": "https://i.ytimg.com/vi/onglPG_dekA/hqdefault.jpg",
      "width": 480,
      "height": 360
     }
    },
    "channelTitle": "Jamie O'Brien",
    "liveBroadcastContent": "none"
   }
  }*/