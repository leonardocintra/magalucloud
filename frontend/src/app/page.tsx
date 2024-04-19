import FilmeCard from "@/components/custom/filme-card";

export default function Home() {
  return (
    <main>
      <div className="flex space-x-2 justify-center">
        <FilmeCard
          assistido={false}
          diretor="Francis Ford Coppola"
          genero="ACAO"
          id={1}
          imagem="/chefao.webp"
          nome="O Poderoso Chefão"
        />

        <FilmeCard
          assistido={false}
          diretor="Tom McGrath"
          genero="INFANTIL"
          id={1}
          imagem="/megamente.jpg"
          nome="Megamente"
        />

        <FilmeCard
          assistido={false}
          diretor="James Cameron"
          genero="ROMANCE"
          id={1}
          imagem="/titanic.jpg"
          nome="Titanic"
        />
      </div>
    </main>
  );
}
