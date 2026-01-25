import Link from "next/link";
import { Button } from "@/components/ui/button";

export default function Home() {
  return (
    <div className="flex h-[calc(100vh-10rem)] flex-col gap-5 p-4 pt-10">
      <h1 className="font-bold md:text-2xl">warcraftcn</h1>
      <p className="max-w-2xl text-sm md:text-base">
        A set of components inspired by classic Warcraft III RTS UI aesthetics.
        Parchment, gothic frames, ornate buttons — open source, copy-paste
        ready. Works with your favorite frameworks. Fan-made. No affiliation.
      </p>
      <Link className="w-fit" href="/docs">
        <Button className="w-fit" size="sm">
          Get Started
        </Button>
      </Link>
    </div>
  );
}
