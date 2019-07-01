export class Ator {
    id: string
    nome: String
    descricao: String

    constructor() {

        this.id = ""
        this.nome = ""
        this.descricao = ""
    }
}

export class Diretor {
    id: string
    nome: String
    idade: number
    descricao: String

    constructor() {

        this.id = ""
        this.nome = ""
        this.descricao = ""
        this.idade = 0;
    }
}

export class Genero {
    id: string
    nome: String
    descricao: String

    constructor() {

        this.id = ""
        this.nome = ""
        this.descricao = ""
    }
}

export class Filme {
    id: string
    descricao: String
    generos: Array<Genero>
    atores: Array<Ator>

    constructor() {

        this.id = ""
        this.descricao = ""
        this.generos = new Array<Genero>()
        this.atores = new Array<Genero>()
    }
}

export class Item {
    id: String; titulo: string; nota: string;
}



