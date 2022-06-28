package com.example.moviesproject

import java.util.ArrayList

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<MovieModel> {

            val list = ArrayList<MovieModel>()

            list.add(
                MovieModel(
                    1,
                    "https://br.web.img3.acsta.net/pictures/17/05/29/23/31/530814.jpg",
                    "Homem-Aranha: De Volta ao Lar",
                    "2h 13m.",
                    "Ação, Comédia, Ficção científica, Aventura, Fantasia.",
                    "Em Homem-Aranha: De Volta ao Lar, depois de atuar ao lado dos Vingadores, chegou a hora de Peter Parker (Tom Holland) voltar para casa e para a sua vida, já não mais tão normal. Lutando diariamente contra pequenos crimes nas redondezas, ele pensa ter encontrado a missão de sua vida quando o terrível vilão Abutre (Michael Keaton) surge amedrontando a cidade. O problema é que a tarefa não será tão fácil como ele imaginava."
                )
            )

            list.add(
                MovieModel(
                    2,
                    "https://images.justwatch.com/poster/176350850/s718/hereditario.%7Bformat%7D",
                    "Hereditário",
                    "2h 7m.",
                    "Terror, Suspense, Mistério, Drama, Sobrenatural",
                    "Após a morte da reclusa avó, a família Graham começa a desvendar algumas coisas. Mesmo após a partida da matriarca, ela permanece como se fosse um sombra sobre a família, especialmente sobre a solitária neta adolescente, Charlie, por quem ela sempre manteve uma fascinação não usual. Com um crescente terror tomando conta da casa, a família explora lugares mais escuros para escapar do infeliz destino que herdaram."
                )
            )

            list.add(
                MovieModel(
                    3,
                    "https://www.kinoplex.com.br/filmes/images/cartaz/262x388/cidade-perdida.jpg",
                    "Cidade Perdida",
                    "1h 52m.",
                    "Romance, Comédia, Ação, Aventura, Comédia romântica.",
                    "A brilhante, porém reclusa, autora Loretta Sage (Sandra Bullock) escreve sobre lugares exóticos em seus romances populares de aventura, cujas capas são estreladas pelo belo modelo Alan (Channing Tatum), que tem dedicado sua vida a personificar o personagem herói, Dash. Durante a turnê de promoção de seu novo livro com Alan, Loretta é raptada por um bilionário excêntrico (Daniel Radcliffe), para que ela o guie ao tesouro da cidade perdida descrita em seu livro recente. A fim de provar que é possível ser um herói na vida real, não somente nas páginas de seus livros, Alan parte para resgatá-la. Forçados a viver uma aventura épica na selva, o par improvável precisa trabalhar junto para sobreviver e encontrar o antigo tesouro, antes que seja perdido para sempre."
                )
            )

            list.add(
                MovieModel(
                    4,
                    "https://m.media-amazon.com/images/I/517aKo0pNsL.jpg",
                    "Sniper Americano",
                    "2h 12m",
                    "Guerra, Ação, Aventura, Drama.",
                    "Chris Kyle é um atirador de elite das forças especiais da marinha dos Estados Unidos. Durante a Guerra do Iraque, sua missão é proteger seus companheiros e seu dever faz dele um dos maiores atiradores da história norte-americana. Sua precisão salva inúmeras vidas, mas também o torna um alvo preferencial. Quando Kyle finalmente volta para casa, ele descobre que não tem como deixar a guerra para trás."
                )
            )

            list.add(
                MovieModel(
                    5,
                    "https://br.web.img3.acsta.net/pictures/16/11/21/15/29/457312.jpg",
                    "Até o Último Homem",
                    "2h 19m",
                    "Guerra, Drama, Ficção histórica",
                    "Em Até o Último Homem, durante a Segunda Guerra Mundial, o médico do exército Desmond T. Doss (Andrew Garfield) se recusa a pegar em uma arma e matar pessoas, porém, durante a Batalha de Okinawa ele trabalha na ala médica e salva mais de 75 homens, sendo condecorado. O que faz de Doss o primeiro Opositor Consciente da história norte-americana a receber a Medalha de Honra do Congresso."
                )
            )

            list.add(
                MovieModel(
                    6,
                    "https://pipocanamadrugada.com.br/site/wp-content/uploads/2016/06/esquadrao-suicida_pipoca-na-madrugada-1.jpg",
                    "O Esquadrão Suicida",
                    "2h 12m",
                    "Ação, Aventura.",
                    "Após a aparição do Superman, a agente Amanda Waller (Viola Davis) está convencida que o governo americano precisa ter sua própria equipe de metahumanos, para combater possíveis ameaças. Para tanto ela cria o projeto do Esquadrão Suicida, onde perigosos vilões encarcerados são obrigados a executar missões a mando do governo. Caso sejam bem-sucedidos, eles têm suas penas abreviadas em 10 anos. Caso contrário, simplesmente morrem. O grupo é autorizado pelo governo após o súbito ataque de Magia (Cara Delevingne), uma das \"convocadas\" por Amanda, que se volta contra ela. Desta forma, Pistoleiro (Will Smith), Arlequina (Margot Robbie), Capitão Bumerangue (Jai Courtney), Crocodilo (Adewale Akinnuoye-Agbaje), El Diablo (Jay Hernandez) e Amarra (Adam Beach) são convocados para a missão. Paralelamente, o Coringa (Jared Leto) aproveita a oportunidade para tentar resgatar o amor de sua vida: Arlequina."
                )
            )

            return  list
        }
    }
}