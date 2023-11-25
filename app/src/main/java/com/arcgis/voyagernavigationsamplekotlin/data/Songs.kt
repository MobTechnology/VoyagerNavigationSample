package com.arcgis.voyagernavigationsamplekotlin.data

import java.util.Date

data class Songs(
    var wrapperType: String? = null,
    var artistId: Int? = 0,
    var collectionId: Int? = 0,
    var artistName: String? = null,
    var collectionName: String? = null,
    var collectionCensoredName: String? = null,
    var artistViewUrl: String? = null,
    var collectionViewUrl: String? = null,
    var artworkUrl60: String? = null,
    var artworkUrl100: String? = null,
    var collectionPrice: Double = 0.0,
    var collectionExplicitness: String? = null,
    var trackCount: Int? = 0,
    var copyright: String? = null,
    var country: String? = null,
    var currency: String? = null,
    var primaryGenreName: String? = null,
    var previewUrl: String? = null,
    var description: String? = null,
    var amgArtistId: Int? = 0,
    var kind: String? = null,
    var trackId: Int? = 0,
    var trackName: String? = null,
    var trackCensoredName: String? = null,
    var trackViewUrl: String? = null,
    var artworkUrl30: String? = null,
    var trackPrice: Double = 0.0,
    var trackExplicitness: String? = null,
    var discCount: Int? = 0,
    var discNumber: Int? = 0,
    var trackNumber: Int? = 0,
    var trackTimeMillis: Int? = 0,
    var isStreamable: Boolean = false,
    var contentAdvisoryRating: String? = null,
    var collectionArtistId: Int? = 0,
    var collectionArtistName: String? = null
)

fun getSongs(): List<Songs> {
    return listOf(
        Songs(
            wrapperType =
            "audiobook",
            artistId = 284145822,
            collectionId = 329945732,
            artistName = "Alan Cross",
            collectionName = "Radiohead: The Alan Cross Guide (Unabridged)",
            collectionCensoredName = "Radiohead: The Alan Cross Guide (Unabridged)",
            artistViewUrl = "https://books.apple.com/us/author/alan-cross/id284145822?uo=4",
            collectionViewUrl = "https://books.apple.com/us/audiobook/radiohead-the-alan-cross-guide-unabridged/id329945732?uo=4",
            artworkUrl60 = "https://is1-ssl.mzstatic.com/image/thumb/Features/v4/f5/2b/ae/f52bae83-3dd4-a899-3d41-a86822b4906d/dj.ppzdcauz.jpg/60x60bb.jpg",
            artworkUrl100 = "https://is1-ssl.mzstatic.com/image/thumb/Features/v4/f5/2b/ae/f52bae83-3dd4-a899-3d41-a86822b4906d/dj.ppzdcauz.jpg/100x100bb.jpg",
            collectionPrice = 3.99,
            collectionExplicitness = "notExplicit",
            trackCount = 1,
            copyright = "© 2009 HarperCollins Publishers Ltd",
            country = "USA",
            currency = "USD",
            primaryGenreName = "Biographies & Memoirs",
            previewUrl =
            "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview123/v4/c3/b6/c6/c3b6c657-1898-622b-f6ba-c4ca8640d45a/mzaf_3621485871191436227.std.aac.p.m4a",
            description =
            "In this new audiobook, broadcaster and music writer Alan Cross narrates the definitive history of Radiohead. Cross succeeds once again in revealing the fascinating history behind the music in the same compelling way we've come to expect from his long broadcasting career."
        ),
        Songs(
            wrapperType =
            "audiobook",
            artistId = 373910417,
            collectionId = 411800795,
            artistName = "Pete Bruen & Chris Tetle",
            collectionName = "Radiohead: A Rockview Audiobiography",
            collectionCensoredName = "Radiohead: A Rockview Audiobiography",
            artistViewUrl = "https://books.apple.com/us/author/pete-bruen/id373910417?uo=4",
            collectionViewUrl = "https://books.apple.com/us/audiobook/radiohead-a-rockview-audiobiography/id411800795?uo=4",
            artworkUrl60 = "https://is1-ssl.mzstatic.com/image/thumb/Music113/v4/a4/62/f7/a462f7fe-b76f-d253-36fd-2b186dd4fc91/lg_image.jpg/60x60bb.jpg",
            artworkUrl100 = "https://is1-ssl.mzstatic.com/image/thumb/Music113/v4/a4/62/f7/a462f7fe-b76f-d253-36fd-2b186dd4fc91/lg_image.jpg/100x100bb.jpg",
            collectionPrice = 2.99,
            collectionExplicitness = "notExplicit",
            trackCount = 1,
            copyright = "© 2010 Rockview",
            country = "USA",
            currency = "USD",
            primaryGenreName = "Nonfiction",
            previewUrl = "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview123/v4/a8/99/fc/a899fc64-b961-d86e-a30e-13d2186ca322/mzaf_6390507081823217577.std.aac.p.m4a",
            description = "Radiohead have been called the Beatles true heirs, a group advancing in such leaps and bounds that their contemporaries are trailing in their wake. For a reputation and status like that you would expect a group to be something out of the ordinary. The band formed when Thom Yorke,  Johnny Greenwood, Ed O Brien, Colin Greenwood and Phil Selway attended a private boys school near Abingdon, near Oxford, UK, broke up whilst they attended University and reformed in 1991 when they signed a recording deal with Parlophone.<br /><br />The band broke in the USA before having UK success. This enabled them to build up a legion of followers who could associate with their music, songs and lyrics. Their third album, in the UK, \"OK Computer\" propelled them to international stardom and by 2007 Radiohead had sold in excess of 25 million albums. This is not a music release by the artist or record label and sound qualilty may vary. In this exclusive audiobiography we hear how fame almost caused them to split up, what inspires them in their writing, the relationship they have with their fans and the message they want to give to the world and to then music is the best artform to explain their opinion of society. Fans, music historians and collectors will get a unique insight into Radiohead."
        ),
        Songs(
            wrapperType = "audiobook",
            artistId = 272036025,
            collectionId = 540937134,
            amgArtistId = 278578,
            artistName = "Opie & Anthony",
            collectionName = "Opie & Anthony, June 28, 2012",
            collectionCensoredName = "Opie & Anthony, June 28, 2012",
            artistViewUrl = "https://books.apple.com/us/author/opie-anthony/id272036025?uo=4",
            collectionViewUrl = "https://books.apple.com/us/audiobook/opie-anthony-june-28-2012/id540937134?uo=4",
            artworkUrl60 = "https://is1-ssl.mzstatic.com/image/thumb/Music/v4/b4/ce/df/b4cedf46-1e43-ea49-75a8-e84a722e99d0/cover.jpg/60x60bb.jpg",
            artworkUrl100 = "https://is1-ssl.mzstatic.com/image/thumb/Music/v4/b4/ce/df/b4cedf46-1e43-ea49-75a8-e84a722e99d0/cover.jpg/100x100bb.jpg",
            collectionPrice = 2.99,
            collectionExplicitness = "notExplicit",
            trackCount = 1,
            copyright = "© 2012 XM Satellite Radio",
            country = "USA",
            currency = "USD",
            primaryGenreName = "Arts & Entertainment",
            previewUrl = "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview123/v4/21/7f/26/217f2667-b5a7-15b2-5d00-2da613793627/mzaf_2367205493605099118.std.aac.p.m4a",
            description = "Today on O&amp;A, we start today’s show talking about Anthony’s past relationships, Louis CK and Seinfeld and Opie’s ex-girlfriends. We continue talking about Radiohead and our hipsters on staff.<br /><br />We discuss the Chinatown Clam Scam, the Asbury Park bathing suit ban and Opie needs a vacation home. Finally, Sam hosts After O&amp;A Live and he talks to the staff about past relationships. [Broadcast Date: June 28, 2012]<br /><br /><b>Explicit Language Warning: You must be 18 years or older to purchase this program."
        ),
        Songs(
            wrapperType =
            "audiobook",
            artistId = 284145822,
            collectionId = 329945732,
            artistName = "Alan Cross",
            collectionName = "Radiohead: The Alan Cross Guide (Unabridged)",
            collectionCensoredName = "Radiohead: The Alan Cross Guide (Unabridged)",
            artistViewUrl = "https://books.apple.com/us/author/alan-cross/id284145822?uo=4",
            collectionViewUrl = "https://books.apple.com/us/audiobook/radiohead-the-alan-cross-guide-unabridged/id329945732?uo=4",
            artworkUrl60 = "https://is1-ssl.mzstatic.com/image/thumb/Features/v4/f5/2b/ae/f52bae83-3dd4-a899-3d41-a86822b4906d/dj.ppzdcauz.jpg/60x60bb.jpg",
            artworkUrl100 = "https://is1-ssl.mzstatic.com/image/thumb/Features/v4/f5/2b/ae/f52bae83-3dd4-a899-3d41-a86822b4906d/dj.ppzdcauz.jpg/100x100bb.jpg",
            collectionPrice = 3.99,
            collectionExplicitness = "notExplicit",
            trackCount = 1,
            copyright = "© 2009 HarperCollins Publishers Ltd",
            country = "USA",
            currency = "USD",
            primaryGenreName = "Biographies & Memoirs",
            previewUrl =
            "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview123/v4/c3/b6/c6/c3b6c657-1898-622b-f6ba-c4ca8640d45a/mzaf_3621485871191436227.std.aac.p.m4a",
            description =
            "In this new audiobook, broadcaster and music writer Alan Cross narrates the definitive history of Radiohead. Cross succeeds once again in revealing the fascinating history behind the music in the same compelling way we've come to expect from his long broadcasting career."
        ),
        Songs(
            wrapperType = "track",
            kind = "song",
            artistId = 321243033,
            collectionId = 1010499557,
            trackId = 1010499559,
            artistName = "Nicholas Cole",
            collectionName = "Night Sessions",
            trackName = "Radiohead",
            collectionCensoredName = "Night Sessions",
            trackCensoredName = "Radiohead",
            artistViewUrl = "https://music.apple.com/us/artist/nicholas-cole/321243033?uo=4",
            collectionViewUrl = "https://music.apple.com/us/album/radiohead/1010499557?i=1010499559&uo=4",
            trackViewUrl = "https://music.apple.com/us/album/radiohead/1010499557?i=1010499559&uo=4",
            previewUrl = "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview115/v4/66/9b/22/669b2217-b1f0-8478-58f1-c669fb6e0345/mzaf_4336597037072777655.plus.aac.p.m4a",
            artworkUrl30 = "https://is1-ssl.mzstatic.com/image/thumb/Music5/v4/a9/06/4f/a9064fbf-01c2-1e02-c377-ed47ef914eb3/886445346596.jpg/30x30bb.jpg",
            artworkUrl60 = "https://is1-ssl.mzstatic.com/image/thumb/Music5/v4/a9/06/4f/a9064fbf-01c2-1e02-c377-ed47ef914eb3/886445346596.jpg/60x60bb.jpg",
            artworkUrl100 = "https://is1-ssl.mzstatic.com/image/thumb/Music5/v4/a9/06/4f/a9064fbf-01c2-1e02-c377-ed47ef914eb3/886445346596.jpg/100x100bb.jpg",
            collectionPrice = 5.99,
            trackPrice = 1.29,
            collectionExplicitness = "notExplicit",
            trackExplicitness = "notExplicit",
            discCount = 1,
            discNumber = 1,
            trackCount = 10,
            trackNumber = 2,
            trackTimeMillis = 220817,
            country = "USA",
            currency = "USD",
            primaryGenreName = "Jazz",
            isStreamable = true
        ),
        Songs(
            wrapperType = "track",
            kind = "song",
            artistId = 657515,
            collectionId = 1097861387,
            trackId = 1097861842,
            artistName = "Radiohead",
            collectionName = "OK Computer",
            trackName = "No Surprises",
            collectionCensoredName = "OK Computer",
            trackCensoredName = "No Surprises",
            artistViewUrl = "https://music.apple.com/us/artist/radiohead/657515?uo=4",
            collectionViewUrl = "https://music.apple.com/us/album/no-surprises/1097861387?i=1097861842&uo=4",
            trackViewUrl = "https://music.apple.com/us/album/no-surprises/1097861387?i=1097861842&uo=4",
            previewUrl = "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview125/v4/ef/02/b7/ef02b776-f887-f1f0-acfb-e7d9776ba503/mzaf_2515606267255808294.plus.aac.p.m4a",
            artworkUrl30 = "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/60/e9/63/60e9632c-0757-58c2-88f8-afaa1f210843/634904078164.png/30x30bb.jpg",
            artworkUrl60 = "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/60/e9/63/60e9632c-0757-58c2-88f8-afaa1f210843/634904078164.png/60x60bb.jpg",
            artworkUrl100 = "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/60/e9/63/60e9632c-0757-58c2-88f8-afaa1f210843/634904078164.png/100x100bb.jpg",
            collectionPrice = 9.99,
            trackPrice = 1.29,
            collectionExplicitness = "notExplicit",
            trackExplicitness = "notExplicit",
            discCount = 1,
            discNumber = 1,
            trackCount = 12,
            trackNumber = 10,
            trackTimeMillis = 229120,
            country = "USA",
            currency = "USD",
            primaryGenreName = "Alternative",
            isStreamable = true
        ),
        Songs(
            wrapperType = "track",
            kind = "song",
            artistId = 657515,
            collectionId = 1097861387,
            trackId = 1097861842,
            artistName = "Radiohead",
            collectionName = "OK Computer",
            trackName = "No Surprises",
            collectionCensoredName = "OK Computer",
            trackCensoredName = "No Surprises",
            artistViewUrl = "https://music.apple.com/us/artist/radiohead/657515?uo=4",
            collectionViewUrl = "https://music.apple.com/us/album/no-surprises/1097861387?i=1097861842&uo=4",
            trackViewUrl = "https://music.apple.com/us/album/no-surprises/1097861387?i=1097861842&uo=4",
            previewUrl = "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview125/v4/ef/02/b7/ef02b776-f887-f1f0-acfb-e7d9776ba503/mzaf_2515606267255808294.plus.aac.p.m4a",
            artworkUrl30 = "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/60/e9/63/60e9632c-0757-58c2-88f8-afaa1f210843/634904078164.png/30x30bb.jpg",
            artworkUrl60 = "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/60/e9/63/60e9632c-0757-58c2-88f8-afaa1f210843/634904078164.png/60x60bb.jpg",
            artworkUrl100 = "https://is1-ssl.mzstatic.com/image/thumb/Music112/v4/60/e9/63/60e9632c-0757-58c2-88f8-afaa1f210843/634904078164.png/100x100bb.jpg",
            collectionPrice = 9.99,
            trackPrice = 1.29,
            collectionExplicitness = "notExplicit",
            trackExplicitness = "notExplicit",
            discCount = 1,
            discNumber = 1,
            trackCount = 12,
            trackNumber = 10,
            trackTimeMillis = 229120,
            country = "USA",
            currency = "USD",
            primaryGenreName = "Alternative",
            isStreamable = true
        )
    )
}