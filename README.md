
## How to execute

1. Clone the project from github.
2. Enter into the project directory in command line using gitbash, cmd or powershell.
3. Run this below maven command: 
> ./mvnw spring-boot:run
4. You can see, App running successfully in 8080 port.

## Test the API 

This API endpoint accepts a GitHub ID and returns Follower GitHub ID’s (up to 5 Followers total) associated with the passed in GitHub ID.  Retrieve data up to 3 levels deep, repeating the process of retrieving Followers (up to 5 Followers total) for each Follower found


### Endpoint URL

1. Open any browser and hit the below url.
2. Replace the {id} placeholder with desired github id.
3. If it is a valid github id and has followers. You can see the response in JSON format.  

>  http://localhost:8080/getFollowersById/{id}

### Method Type: GET

#### Example Request and Response

Request URL: 

> http://localhost:8080/getFollowersById/koushikkothagal

Response Body: 

```
{
   "id":"koushikkothagal",
   "follower":[
      {
         "id":"ah-meisami",
         "follower":[
            {
               "id":"devevangel",
               "follower":[
                  {
                     "id":"Infinime"
                  },
                  {
                     "id":"Hina-softwareEngineer"
                  },
                  {
                     "id":"EJ-C"
                  },
                  {
                     "id":"apanesar11"
                  },
                  {
                     "id":"smac89"
                  }
               ]
            },
            {
               "id":"Yuridsm",
               "follower":[
                  {
                     "id":"JoseAurelianoJR"
                  },
                  {
                     "id":"BarbosaJackson"
                  },
                  {
                     "id":"dalinhuang99"
                  },
                  {
                     "id":"wba25"
                  },
                  {
                     "id":"kaue"
                  }
               ]
            },
            {
               "id":"Chongongb",
               "follower":[
                  {
                     "id":"AbduMurad"
                  },
                  {
                     "id":"Aditi0205"
                  }
               ]
            },
            {
               "id":"shouryamundra",
               "follower":[
                  {
                     "id":"latrujil913"
                  },
                  {
                     "id":"Alex-bytedroid"
                  },
                  {
                     "id":"flaviolunaferreira"
                  },
                  {
                     "id":"SamirJouni"
                  },
                  {
                     "id":"Onyedikachi123"
                  }
               ]
            },
            {
               "id":"NurudeenA",
               "follower":[
                  {
                     "id":"SamirJouni"
                  },
                  {
                     "id":"abu-hasib"
                  },
                  {
                     "id":"AbduMurad"
                  },
                  {
                     "id":"Aditi0205"
                  },
                  {
                     "id":"aditi-kharadi"
                  }
               ]
            }
         ]
      },
      {
         "id":"robinxavier17",
         "follower":[
            {
               "id":"mhshahib",
               "follower":[
                  {
                     "id":"lcabrerav"
                  },
                  {
                     "id":"Iliasmohammed0"
                  },
                  {
                     "id":"chowdhuary1882"
                  },
                  {
                     "id":"Zhaituona"
                  },
                  {
                     "id":"AmenaChowdhury"
                  }
               ]
            },
            {
               "id":"batermj",
               "follower":[
                  {
                     "id":"chetanspeed511987"
                  },
                  {
                     "id":"alicedu"
                  },
                  {
                     "id":"Jasonwu2014"
                  },
                  {
                     "id":"lbocken"
                  },
                  {
                     "id":"zhangcheng"
                  }
               ]
            }
         ]
      },
      {
         "id":"cinexin",
         "follower":[
            {
               "id":"angusshire",
               "follower":[
                  {
                     "id":"HKyang07"
                  },
                  {
                     "id":"leontius"
                  },
                  {
                     "id":"msuworld"
                  },
                  {
                     "id":"gautamkishore"
                  },
                  {
                     "id":"MargaretWang"
                  }
               ]
            },
            {
               "id":"lifei99",
               "follower":[
                  {
                     "id":"liu181"
                  },
                  {
                     "id":"taotaosheng"
                  },
                  {
                     "id":"xiaoshuai23"
                  },
                  {
                     "id":"d-jin"
                  },
                  {
                     "id":"js-guy"
                  }
               ]
            },
            {
               "id":"mariodev12",
               "follower":[
                  {
                     "id":"mate2"
                  },
                  {
                     "id":"IzumiSy"
                  },
                  {
                     "id":"aziks"
                  },
                  {
                     "id":"amkyn"
                  },
                  {
                     "id":"RCMainak"
                  }
               ]
            },
            {
               "id":"mstraughan86",
               "follower":[
                  {
                     "id":"choisington"
                  },
                  {
                     "id":"jag1993"
                  },
                  {
                     "id":"dalinhuang99"
                  },
                  {
                     "id":"bvolpato"
                  },
                  {
                     "id":"MichalPaszkiewicz"
                  }
               ]
            },
            {
               "id":"vkandola",
               "follower":[
                  {
                     "id":"cusspvz"
                  },
                  {
                     "id":"jacquerie"
                  },
                  {
                     "id":"angusshire"
                  },
                  {
                     "id":"metadings"
                  },
                  {
                     "id":"raosaha"
                  }
               ]
            }
         ]
      },
      {
         "id":"rajendra4625"
      },
      {
         "id":"melas123",
         "follower":[
            {
               "id":"thameursaadi",
               "follower":[
                  {
                     "id":"miirale"
                  },
                  {
                     "id":"helalouna"
                  },
                  {
                     "id":"rahma12"
                  },
                  {
                     "id":"GhadaNouirMahjoub"
                  },
                  {
                     "id":"nouhayousfi"
                  }
               ]
            },
            {
               "id":"SamiDghim",
               "follower":[
                  {
                     "id":"FelhiAbdelhafidh"
                  },
                  {
                     "id":"thameursaadi"
                  },
                  {
                     "id":"DghimOlfa"
                  },
                  {
                     "id":"OmarMahdoui"
                  },
                  {
                     "id":"Nacim91"
                  }
               ]
            },
            {
               "id":"OmarMahdoui",
               "follower":[
                  {
                     "id":"SamiDghim"
                  },
                  {
                     "id":"Nacim91"
                  }
               ]
            },
            {
               "id":"moujib85",
               "follower":[
                  {
                     "id":"fatmalabidi"
                  }
               ]
            },
            {
               "id":"DalfroseCeline"
            }
         ]
      }
   ]
}

```






